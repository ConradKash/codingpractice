def reverseString(x):
    """
    Do not return anything, modify s in-place instead.
    """
    # Split string into list of words
    s = x.split()    
    # Two pointer approach
    left = 0
    right = len(s) - 1
    while left < right:
        # Swap
        s[left], s[right] = s[right], s[left]
        # Increment left
        left += 1
        # Decrement right
        right -= 1
    return " ".join(s)

print(reverseString("    I am the goat"))