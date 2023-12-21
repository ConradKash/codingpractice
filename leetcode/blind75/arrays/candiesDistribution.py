def candiesDistribution(array, candies):
    """
    Distributes candies to each element in the array and determines if the resulting value is greater than or equal to the maximum value in the array.

    Args:
        array (list): The input array of integers.
        candies (int): The number of candies to distribute.

    Returns:
        tuple: A tuple containing three lists:
            - results (list): A list of boolean values indicating if the resulting value is greater than or equal to the maximum value.
            - resultsnum (list): A list of the resulting values after distributing candies.
            - resultsint (list): A list of the original values from the input array.

    """

    results = []
    maxvalue = 0


    # Find the maximum value in the array
    for candy in array:
        if maxvalue < candy:
            maxvalue = candy

    # Distribute candies and determine if the resulting value is greater than or equal to the maximum value
    for i in range(len(array)):
        x = array[i] + candies
        if x >= maxvalue:
            results.append(True)
        else:
            results.append(False)

    return results

if __name__ == "__main__":
    print(candiesDistribution([2, 3, 5, 1, 3], 3))
    print(candiesDistribution([4, 2, 1, 1, 2], 1))
    print(candiesDistribution([12, 1, 2], 10))
