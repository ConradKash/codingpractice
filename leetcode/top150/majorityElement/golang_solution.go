package main

// majorityElement finds the majority element in an array using Boyer-Moore Voting Algorithm.
// The majority element is the element that appears more than ⌊n/2⌋ times in the array.

// Algorithm explanation:
// The Boyer-Moore Voting Algorithm works by maintaining a candidate and a count:
// 1. When count is 0, we select the current element as our new candidate
// 2. When we encounter the candidate, we increment the count
// 3. When we encounter a different element, we decrement the count

// Why this works:
// - If an element appears more than n/2 times, it will survive all the cancellations
// - Each occurrence of the majority element can cancel out at most one non-majority element
// - Since the majority element appears more than half the time, it will always remain as the candidate

// Time Complexity: O(n) - single pass through the array
// Space Complexity: O(1) - only uses two variables

// Parameters:
//   - nums: slice of integers containing at least one element, guaranteed to have a majority element

// Returns:
//   - int: the majority element that appears more than ⌊n/2⌋ times
func majorityElement(nums []int) int {
	count := 0
	var candidate int

	for _, num := range nums {
		if count == 0 {
			candidate = num
		}
		if num == candidate {
			count++
		} else {
			count--
		}
	}

	return candidate
}

func main() {
	nums := []int{3, 2, 3}
	result := majorityElement(nums)
	// result should be 3
	println(result)

	nums2 := []int{2, 2, 1, 1, 1, 2, 2}
	result2 := majorityElement(nums2)
	// result2 should be 2
	println(result2)
}
