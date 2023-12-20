from leetcode.blind75.arrays.mergearray import mergeAlternatively
from leetcode.blind75.arrays.gcd_of_arrays import gcdOfStrings

def test_mergeAlternatively():
    assert mergeAlternatively(['a','f','g'], ['i','j','k']) == "aifjgk"
    
def test_gcdOfArrays():
    assert gcdOfStrings("ABCABC", "ABC") == "ABC"
    assert gcdOfStrings("ABABAB", "ABAB") == "AB"
    assert gcdOfStrings("LEET", "CODE") == ""
    assert gcdOfStrings("txxtxxtxx", "txx") == "txx"