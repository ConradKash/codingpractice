def productExceptSelf(nums):
    """
    :type nums: List[int]
    :rtype: List[int]
    """
    # O(n) time, O(1) space
    # left = [1]
    # right = [1]
    # for i in range(1, len(nums)):
    #     left.append(left[i-1] * nums[i-1])
    #     right.append(right[i-1] * nums[-i])
    # right.reverse()
    # return [left[i] * right[i] for i in range(len(nums))]

    # O(n) time, O(1) space
    # left = [1]
    # for i in range(1, len(nums)):
    #     left.append(left[i-1] * nums[i-1])
    # right = 1
    # for i in range(len(nums)-1, -1, -1):
    #     left[i] *= right
    #     right *= nums[i]
    # return left

    # O(n) time, O(1) space
    
    ans = [1]
    for i in range(1, len(nums)):
        ans.append(ans[i-1] * nums[i-1])
    right = 1
    for i in range(len(nums)-1, -1, -1):
        ans[i] *= right
        right *= nums[i]
    return ans
print(productExceptSelf([1,2,3,4]))