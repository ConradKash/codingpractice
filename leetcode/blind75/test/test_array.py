from leetcode.blind75.arrays.mergearray import mergeAlternatively
from leetcode.blind75.arrays.gcd_of_arrays import gcdOfStrings
from leetcode.blind75.arrays.candiesDistribution import candiesDistribution
from leetcode.blind75.arrays.flower_gardening import canPlaceFlower

def test_mergeAlternatively():
    assert mergeAlternatively(['a','f','g'], ['i','j','k']) == "aifjgk"
    
def test_gcdOfArrays():
    assert gcdOfStrings("ABCABC", "ABC") == "ABC"
    assert gcdOfStrings("ABABAB", "ABAB") == "AB"
    assert gcdOfStrings("LEET", "CODE") == ""
    assert gcdOfStrings("txxtxxtxx", "txx") == "txx"
    
def test_candiesDistribution():
    assert candiesDistribution([2, 3, 5, 1, 3], 3) == [True, True, True, False, True]
    assert candiesDistribution([4, 2, 1, 1, 2], 1) == [True, False, False, False, False]
    assert candiesDistribution([12, 1, 3], 10) == [True, False, True]
    
def test_flowerbed():
    assert canPlaceFlower([1,0,0,0,1,0,0,0,0,0,1,0,0], 4) == True
    assert canPlaceFlower([0,0,0,0], 2) == True
    assert canPlaceFlower([0], 1) == True