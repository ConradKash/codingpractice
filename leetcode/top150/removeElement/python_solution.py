def removeElement(self, nums, val):
    x = 0
    for i in range(len(nums)):
        if nums[i] != val:
            nums[x] = nums[i]
            x += 1
    return x


# Example usage:
nums = [3, 2, 2, 3]
val = 3
solution = removeElement(None, nums, val)
print(solution)  # Output: 2
print(nums[:solution])  # Output: [2, 2]
