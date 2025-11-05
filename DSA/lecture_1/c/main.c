#include <stdio.h>
#include "boolean.h"
#include "byte.h"

int main()
{
    boolean b1 = create_boolean(1);
    boolean b2 = create_boolean(0);

    printf("b1 AND b2: %s\n", boolean_tostring(boolean_and(b1, b2)));
    printf("b1 OR b2: %s\n", boolean_tostring(boolean_or(b1, b2)));
    printf("NOT b1: %s\n", boolean_tostring(boolean_not(b1)));

    byte x = create_byte(10);
    byte y = create_byte(20);

    printf("x + y = %d\n", byte_toint(byte_add(x, y)));
    printf("x - y = %d\n", byte_toint(byte_subtract(x, y)));

    return 0;
}