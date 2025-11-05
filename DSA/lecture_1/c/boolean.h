#ifndef BOOLEAN_H
#define BOOLEAN_H

typedef enum
{
    FALSE = 0,
    TRUE = 1
} boolean;

boolean create_boolean(int value);

boolean boolean_and(boolean a, boolean b);
boolean boolean_or(boolean a, boolean b);
boolean boolean_not(boolean a);
boolean boolean_equals(boolean a, boolean b);
char *boolean_tostring(boolean a);

#endif