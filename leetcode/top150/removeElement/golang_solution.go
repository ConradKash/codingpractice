package main

import "fmt"

func removeElement(nums []int, val int) (int, []int) {
	k := 0
	for _, num := range nums {
		if num != val {
			nums[k] = num
			k++
		}
	}
	return k, nums
}

// Example usage:
func main() {
	nums := []int{3, 2, 2, 3}
	val := 3
	newLength, modifiedNums := removeElement(nums, val)
	// newLength should be 2, and modifiedNums should have the first two elements as 2
	println(newLength)
	fmt.Println(modifiedNums)

}
