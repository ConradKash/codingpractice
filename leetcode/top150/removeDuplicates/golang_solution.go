package main

import "fmt"

func removeDuplicates(nums []int) (int, []int) {
	if len(nums) == 0 {
		return 0, nums
	}
	k := 1
	for i := 1; i < len(nums); i++ {
		if nums[i] != nums[i-1] {
			nums[k] = nums[i]
			k++
		}
	}
	return k, nums
}

func main() {
	nums := []int{1, 1, 2, 3, 4, 4}
	newLength, modifiedNums := removeDuplicates(nums)
	// newLength should be 2, and modifiedNums should have the first two elements as 1 and 2
	println(newLength)
	fmt.Println(modifiedNums)
}
