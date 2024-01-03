from leetcode.daily.day1 import findContentChildren
from leetcode.daily.day2 import findMatrix
from leetcode.daily.day3 import laser_bank

def test_findContentChildren():
    assert findContentChildren([], []) == 0
    assert findContentChildren([1], [1]) == 1
    assert findContentChildren([1], [1, 2, 3]) == 1
    assert findContentChildren([1, 2, 3], [1, 1, 1]) == 1
    assert findContentChildren([1, 2, 3], [1, 2, 3, 4, 5]) == 3
    assert findContentChildren([1, 2, 3], []) == 0
    assert findContentChildren([2,5], [1, 2, 3]) == 1
    assert findContentChildren([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == 5

def test_findMatrix():
    assert findMatrix([1,3,4,1,2,3,1]) == [[1,3,4,2],[1,3],[1]]
    assert findMatrix([1,2,3,4,5,6,7,8,9,10]) == [[1,2,3,4,5,6,7,8,9,10]]

def test_laser_bank():
    assert laser_bank(["011001","001010"]) == 6
    assert laser_bank(["101","001","101","101","010"]) == 10
    assert laser_bank(["101","001","101","101","010","101","001","101","101","010"]) == 22
    assert laser_bank(["101","001","101","101","010","101","001","101","101","010","101","001","101","101","010"]) == 34
    