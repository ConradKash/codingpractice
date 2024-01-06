from leetcode.daily.day1 import findContentChildren
from leetcode.daily.day2 import findMatrix
from leetcode.daily.day3 import laser_bank
from leetcode.daily.day4 import minOperations
from leetcode.daily.day5 import lengthOfLIS
from leetcode.daily.day6 import jobScheduling

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
    
def test_minOperations():
    assert minOperations([1,1,1]) == 1
    assert minOperations([1,1,2,2,2,3,3,3,4,4,4]) == 4
    assert minOperations([1,2,3,4,5,6]) == -1
    assert minOperations([1,10,100,1000]) == -1
    
def test_lengthOfLIS():
    assert lengthOfLIS([10,9,2,5,3,7,101,18]) == 4
    assert lengthOfLIS([0,1,0,3,2,3]) == 4
    assert lengthOfLIS([7,7,7,7,7,7,7]) == 1
    assert lengthOfLIS([4,10,4,3,8,9]) == 3
    assert lengthOfLIS([1,3,6,7,9,4,10,5,6]) == 6
    assert lengthOfLIS([10,9,2,5,3,7,101,18]) == 4
    
def test_jobScheduling():
    assert jobScheduling([1,2,3,3], [3,4,5,6], [50,10,40,70]) == 120
    assert jobScheduling([1,2,3,4,6], [3,5,10,6,9], [20,20,100,70,60]) == 150
    assert jobScheduling([1,1,1], [2,3,4], [5,6,4]) == 6
    assert jobScheduling([1,2,3,4,6], [3,5,10,6,9], [20,20,100,70,60]) == 150
    assert jobScheduling([1,1,1], [2,3,4], [5,6,4]) == 6
    assert jobScheduling([1,2,3,4,6], [3,5,10,6,9], [20,20,100,70,60]) == 150
    assert jobScheduling([1,1,1], [2,3,4], [5,6,4]) == 6
    assert jobScheduling([1,2,3,4,6], [3,5,10,6,9], [20,20,100,70,60]) == 150
    assert jobScheduling([1,1,1], [2,3,4], [5,6,4]) == 6
    assert jobScheduling([1,2,3,4,6], [3,5,10,6,9], [20,20,100,70,60]) == 150
    assert jobScheduling([1,1,1], [2,3,4], [5,6,4]) == 6