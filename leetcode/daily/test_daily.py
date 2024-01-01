from leetcode.daily.day1 import findContentChildren

def test_findContentChildren():
    assert findContentChildren([], []) == 0
    assert findContentChildren([1], [1]) == 1
    assert findContentChildren([1], [1, 2, 3]) == 1
    assert findContentChildren([1, 2, 3], [1, 1, 1]) == 1
    assert findContentChildren([1, 2, 3], [1, 2, 3, 4, 5]) == 3
    assert findContentChildren([1, 2, 3], []) == 0
    assert findContentChildren([2,5], [1, 2, 3]) == 1
    assert findContentChildren([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == 5

