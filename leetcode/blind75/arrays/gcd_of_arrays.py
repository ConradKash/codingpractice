def gcdOfStrings(str1, str2):
    """
    Returns the greatest common divisor of two strings.

    :param str1: The first string.
    :type str1: str
    :param str2: The second string.
    :type str2: str
    :return: The greatest common divisor of the two strings.
    :rtype: str
    """
    # Check if concatenating str1 and str2 is equal to concatenating str2 and str1
    if (str1 + str2) != (str2 + str1):
        return ""

    # Check if str1 is equal to str2
    elif str1 == str2:
        return str1

    else:
        # Define a helper function to calculate the greatest common divisor
        def gcd(i, j):
            if j == 0:
                return i
            return gcd(j, i % j)
        
        # Calculate the length of the greatest common divisor of str1 and str2
        gcdVal = gcd(len(str1), len(str2))

        # Return the substring of str2 with length gcdVal
        return str2[:gcdVal]
    
