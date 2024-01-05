# Define a function to calculate the length of the longest increasing subsequence in a given list of numbers
def lengthOfLIS(nums):
    """
    Calculates the length of the longest increasing subsequence in a given list of numbers.

    Args:
        nums (List[int]): The input list of numbers.

    Returns:
        int: The length of the longest increasing subsequence.
    """

    # Check if the input list is empty
    if not nums:
        # If the list is empty, return 0
        return 0

    # Create a list dp with the same length as the input list, initialized with 1s
    dp = [1] * len(nums)
    print(dp)

    # Iterate through the input list starting from the second element
    for i in range(1, len(nums)):
        # Iterate through the elements before the current element
        for j in range(i):
            # Check if the current element is greater than the previous element
            if nums[i] > nums[j]:
                # Update the value in dp at index i with the maximum value between its current value and dp[j] + 1
                dp[i] = max(dp[i], dp[j] + 1)
    print(nums)            
    print(dp)
    # Return the maximum value in dp, which represents the length of the longest increasing subsequence
    return max(dp)

print(lengthOfLIS([10,9,2,5,3,7,101,18])) # 4