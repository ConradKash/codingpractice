def findContentChildren(g, s):
    # Sort both lists in ascending order for efficient matching
    s.sort()  
    g.sort()  

    # Initialize variables for tracking progress
    index = 0  # Pointer to the current cookie being considered
    cnt = 0    # Counter for the number of satisfied children

    # Iterate through both lists to match cookies with children
    while index < len(s) and cnt < len(g):  # Continue as long as there are both cookies and children
        if s[index] >= g[cnt]:  # If the current cookie can satisfy the current child's greed factor
            cnt += 1  # Increment the count of satisfied children
        index += 1  # Always move to the next cookie, regardless of whether a child was satisfied

    # Return the final count of content children
    return cnt