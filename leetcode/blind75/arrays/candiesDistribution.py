def candiesDistribution(array,  candies):
    results = []
    maxvalue = 0
    resultsnum = []
    resultsint = []
    for candy in array:
        if maxvalue < candy:
            maxvalue = candy
        

    for i in range(len(array)):
        x = array[i] + candies
        resultsint.append(array[i])
        if x >= maxvalue:
            resultsnum.append(x)
            results.append(True)
        else:
            resultsnum.append(x)
            results.append(False)
        
    
    return results, resultsnum, resultsint

if __name__ == "__main__":
    print(candiesDistribution([2, 3, 5, 1, 3], 3))
    print(candiesDistribution([4, 2, 1, 1, 2], 1))
    print(candiesDistribution([12, 1, 2], 10))
    
