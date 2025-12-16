package main

// maxProfit calculates the maximum profit that can be achieved from a single buy and sell transaction
// given an array of stock prices where prices[i] is the price of the stock on day i.
//
// The function finds the maximum difference between a selling price and a buying price where the
// buying day comes before the selling day. It maintains a running minimum price seen so far and
// calculates the profit if selling at the current price. The maximum profit encountered is returned.
//
// Parameters:
//   - prices: A slice of integers representing stock prices on consecutive days
//
// Returns:
//   - An integer representing the maximum profit achievable. Returns 0 if no profit can be made
//     or if the prices slice is empty.
//
// Time Complexity: O(n) where n is the length of the prices slice
// Space Complexity: O(1)
//
// Example:
//   prices := []int{7, 1, 5, 3, 6, 4}
//   profit := maxProfit(prices) // Returns 5 (buy at 1, sell at 6)
func maxProfit(prices []int) int {
	if len(prices) == 0 {
		return 0
	}
	
	minPrice := prices[0]
	maxProfit := 0

	for _, price := range prices {
		if price < minPrice {
			minPrice = price
		} else if price - minPrice > maxProfit {
			maxProfit = price - minPrice
		}
	}
	return maxProfit

}

func main() {
	prices := []int{7, 1, 5, 3, 6, 4}
	result := maxProfit(prices)
	// result should be 5
	println(result)

	prices2 := []int{7, 6, 4, 3, 1}
	result2 := maxProfit(prices2)
	// result2 should be 0
	println(result2)
}
