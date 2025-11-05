#include "boolean.h"
#include <string.h>
#include <stdlib.h>

boolean create_boolean(int value)
{
    return (value != 0) ? TRUE : FALSE;
}

boolean boolean_and(boolean a, boolean b)
{
    return (a == TRUE && b == TRUE) ? TRUE : FALSE;
}

boolean boolean_or(boolean a, boolean b)
{
    return (a == TRUE || b == TRUE) ? TRUE : FALSE;
}

boolean boolean_not(boolean a)
{
    return (a == TRUE) ? FALSE : TRUE;
}

boolean boolean_equals(boolean a, boolean b)
{
    return (a == b) ? TRUE : FALSE;
}
char *boolean_tostring(boolean a)
{
    return (a == TRUE) ? "true" : "false";
}