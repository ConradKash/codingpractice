package main

import "fmt"

// rotate rotates the elements of nums array to the right by k positions.
// It uses a three-step reversal algorithm:
// 1. Reverse the entire array
// 2. Reverse the first k elements
// 3. Reverse the remaining n-k elements
//
// For example, given nums = [1,2,3,4,5,6,7] and k = 3:
// - After step 1: [7,6,5,4,3,2,1]
// - After step 2: [5,6,7,4,3,2,1]
// - After step 3: [5,6,7,1,2,3,4]
//
// Time complexity: O(n) where n is the length of the array
// Space complexity: O(1) as the rotation is done in-place
//
// Parameters:
//   - nums: the input array to be rotated (modified in-place)
//   - k: number of positions to rotate; k is normalized using modulo to handle cases where k > len(nums)
func rotate(nums []int, k int) {
	n := len(nums)
	k = k % n

	reverse := func(start, end int) {
		for start < end {
			nums[start], nums[end] = nums[end], nums[start]
			start++
			end--
		}
	}
	reverse(0, n-1)
	reverse(0, k-1)
	reverse(k, n-1)
}

func main() {
	nums := []int{1, 2, 3, 4, 5, 6, 7}
	k := 3
	rotate(nums, k)
	// nums should be [5,6,7,1,2,3,4]
	fmt.Println(nums)

	nums2 := []int{-1, -100, 3, 99}
	k2 := 2
	rotate(nums2, k2)
	fmt.Println(nums2)
}
