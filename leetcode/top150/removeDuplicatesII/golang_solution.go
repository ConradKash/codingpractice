package main

func removeDuplicates(nums []int) int {
	if len(nums) == 0 {
		return 0
	}
	k := 1
	count := 1
	for i := 1; i < len(nums); i++ {
		if nums[i] == nums[i-1] {
			count++
		} else {
			count = 1
		}
		if count <= 2 {
			nums[k] = nums[i]
			k++
		}
	}
	return k
}

func main() {
	nums := []int{1, 1, 1, 2, 2, 2, 3, 4}
	newLength := removeDuplicates(nums)
	// newLength should be 5, and the first five elements of nums should be 1, 1, 2, 2, 3
	println(newLength)
}
