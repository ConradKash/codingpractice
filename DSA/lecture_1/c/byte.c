#include "byte.h"
#include "boolean.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <limits.h>

byte create_byte(signed char value)
{
    return value;
}

byte byte_add(byte a, byte b)
{
    return (byte)(a + b);
}

byte byte_subtract(byte a, byte b)
{
    return (byte)(a - b);
}

byte byte_multiply(byte a, byte b)
{
    return (byte)(a * b);
}

byte byte_divide(byte a, byte b)
{
    if (b == 0)
    {
        return 0;
    }
    printf("%d\n", (int)a);
    printf("%d\n", (int)b);
    return (byte)(a / b);
}

byte byte_negate(byte a)
{
    return (byte)(-a);
}

byte byte_and(byte a, byte b)
{
    return a & b;
}

byte byte_or(byte a, byte b)
{
    return a | b;
}

int byte_compare(byte a, byte b)
{
    return (a - b);
}

boolean byte_equals(byte a, byte b)
{
    return (a == b) ? TRUE : FALSE;
}

int byte_toint(byte a)
{
    return (int)a;
}

char byte_tochar(byte a)
{
    return (char)a;
}
