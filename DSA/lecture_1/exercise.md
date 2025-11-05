# Profile: Built-in and user-defined data types — C vs Java
### Java commin data types are 
- Java built-in types are `byte` , `short` , `int` , `long`, `float`, `double`, `char`, `boolean` (true/false).
- Java user defined are `class`, `interface`, `enum`, `array`.

### While C has
- C built-in types are `char`, `short`, `int`, `long`, `float`, `double`.
- C user defined are `struct`, `union`, `enum`, `typedef`.

## Key differences
- Java has a `boolen` (true/false)

- Java has a `byte`

Goal implemented below: provide abstract C representations that match Java primitive semantics (fixed widths, char as uint16_t, Java-like byte with two's-complement overflow, boolean). A single compact demo program shows usage for each abstract type.

Code: java_primitives.c

```c
/* java_primitives.c
    Demonstrate abstract C types that model Java primitives:
    JavaByte, JavaShort, JavaInt, JavaLong, JavaFloat, JavaDouble,
    JavaChar (uint16_t), JavaBoolean.
*/
#include <stdio.h>
#include <stdint.h>
#include <inttypes.h>
#include <stdbool.h>

typedef struct { int8_t v; } JavaByte;
typedef struct { int16_t v; } JavaShort;
typedef struct { int32_t v; } JavaInt;
typedef struct { int64_t v; } JavaLong;
typedef struct { float v; } JavaFloat;
typedef struct { double v; } JavaDouble;
typedef struct { uint16_t v; } JavaChar;      /* Java char: 16-bit unsigned UTF-16 code unit */
typedef uint8_t JavaBoolean;                  /* 0 == false, non-zero == true */

static inline JavaByte jb_new(int32_t x) { JavaByte r; r.v = (int8_t)x; return r; }
static inline JavaByte jb_add(JavaByte a, JavaByte b) { return jb_new((int32_t)a.v + (int32_t)b.v); }

static inline JavaShort js_new(int32_t x) { JavaShort r; r.v = (int16_t)x; return r; }
static inline JavaShort js_add(JavaShort a, JavaShort b) { return js_new((int32_t)a.v + (int32_t)b.v); }

static inline JavaInt ji_new(int64_t x) { JavaInt r; r.v = (int32_t)x; return r; }
static inline JavaInt ji_add(JavaInt a, JavaInt b) { return ji_new((int64_t)a.v + (int64_t)b.v); }

static inline JavaLong jl_new(int64_t x) { JavaLong r; r.v = (int64_t)x; return r; }
static inline JavaLong jl_add(JavaLong a, JavaLong b) { return jl_new(a.v + b.v); }

static inline JavaFloat jf_new(float x) { JavaFloat r; r.v = x; return r; }
static inline JavaDouble jd_new(double x) { JavaDouble r; r.v = x; return r; }

static inline JavaChar jc_new(uint32_t code) { JavaChar r; r.v = (uint16_t)code; return r; }

static inline JavaBoolean jbool_true()  { return 1; }
static inline JavaBoolean jbool_false() { return 0; }

void demo_byte(void) {
     JavaByte a = jb_new(120);
     JavaByte b = jb_new(10);
     JavaByte c = jb_add(a, b); /* overflow wraps like Java byte (two's complement) */
     printf("JavaByte: %d + %d = %d\n", a.v, b.v, c.v);
}

void demo_short(void) {
     JavaShort s1 = js_new(30000);
     JavaShort s2 = js_new(10000);
     JavaShort s3 = js_add(s1, s2);
     printf("JavaShort: %d + %d = %d\n", s1.v, s2.v, s3.v);
}

void demo_int(void) {
     JavaInt x = ji_new(1<<30);
     JavaInt y = ji_new(1<<30);
     JavaInt z = ji_add(x, y); /* demonstrates 32-bit wrap */
     printf("JavaInt: %" PRId32 " + %" PRId32 " = %" PRId32 "\n", x.v, y.v, z.v);
}

void demo_long(void) {
     JavaLong L1 = jl_new(9000000000LL);
     JavaLong L2 = jl_new(1234567890LL);
     JavaLong L3 = jl_add(L1, L2);
     printf("JavaLong: %" PRId64 " + %" PRId64 " = %" PRId64 "\n", L1.v, L2.v, L3.v);
}

void demo_float_double(void) {
     JavaFloat pf = jf_new(3.14159f);
     JavaDouble pd = jd_new(2.718281828459045);
     printf("JavaFloat: %f  JavaDouble: %lf\n", pf.v, pd.v);
}

void demo_char(void) {
     JavaChar c1 = jc_new('A');       /* ASCII fits in UTF-16 */
     JavaChar c2 = jc_new(0x03A9);    /* Greek capital Omega (Ω) code point in BMP */
     printf("JavaChar: code=%u, char=", (unsigned)c1.v);
     putchar((c1.v <= 0x7F) ? (int)c1.v : '?'); /* print ASCII char or ? for non-ASCII */
     printf("   code=%u, char=", (unsigned)c2.v);
     putchar((c2.v <= 0x7F) ? (int)c2.v : '?');
     printf("\n");
}

void demo_boolean(void) {
     JavaBoolean t = jbool_true();
     JavaBoolean f = jbool_false();
     printf("JavaBoolean: true=%u false=%u\n", (unsigned)t, (unsigned)f);
}

int main(void) {
     demo_byte();
     demo_short();
     demo_int();
     demo_long();
     demo_float_double();
     demo_char();
     demo_boolean();
     return 0;
}
```

Notes and guidance:
- The C code models Java semantics by using fixed-width integer types (int8_t/int16_t/int32_t/int64_t) so behavior is consistent across platforms.
- JavaChar is modeled as uint16_t; full Unicode handling (surrogate pairs, UTF-8 conversion) requires extra code and is out of scope for this short demo.
- JavaBoolean is represented as a byte (uint8_t) to make boolean value explicit; you can also use _Bool/stdbool.h but this keeps the mapping clear.
- For production interop with Java or strict JVM-like behavior, add bounds checks, casting helpers, conversions, and proper Unicode handling.

References:
- Java primitive types: the Java Language Specification.
- C fixed-width types: C99 stdint.h / inttypes.h.
