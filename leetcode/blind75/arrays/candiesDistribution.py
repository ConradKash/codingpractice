def candiesDistribution(array,  candies):
    results = []
    resultsnum = []
    resultsint = []
    for i in range(1, len(array)):
        key = array[i]
        j = i - 1
        while j >= 0 and array[j] > key:
            array[j + 1] = array[j]
            j -= 1
        array[j + 1] = key

    for i in range(len(array)):
        x = array[i] + candies
        resultsint.append(array[i])
        if x > array[-1]:
            resultsnum.append(x)
            results.append(True)
        else:
            resultsnum.append(x)
            results.append(False)
        
    
    return results, resultsnum, resultsint

if __name__ == "__main__":
    print(candiesDistribution([2, 3, 5, 1, 3], 3))
    print(candiesDistribution([4, 2, 1, 1, 2], 1))
    print(candiesDistribution([12, 1, 5], 10))
    
