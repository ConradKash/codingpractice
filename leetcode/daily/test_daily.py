from leetcode.daily.day1 import findContentChildren
from leetcode.daily.day2 import findMatrix
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
