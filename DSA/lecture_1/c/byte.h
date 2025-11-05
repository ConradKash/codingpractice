#ifndef BYTE_H
#define BYTE_H
#include "boolean.h"

typedef signed char byte;

byte create_byte(signed char value);

byte byte_add(byte a, byte b);
byte byte_subtract(byte a, byte b);
byte byte_multiply(byte a, byte b);
byte byte_divide(byte a, byte b);
byte byte_negate(byte a);
byte byte_and(byte a, byte b);
byte byte_or(byte a, byte b);

int byte_compare(byte a, byte b);
boolean byte_equals(byte a, byte b);

int byte_toint(byte a);
char byte_tochar(byte a);

#endif