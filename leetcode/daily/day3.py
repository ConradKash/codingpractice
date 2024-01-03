def laser_bank(bank):
    # Your code here
    #temp stores the number of 1s in the previous string
    #ans stores the total number of beams
    ans, temp = 0, 0
    for s in bank:
        #n stores the number of 1s in the current string
        n = s.count('1')
        #if the string has only zeros we skip it
        if n == 0:
            continue
        #we add the number of beams that can be formed with the current string
        ans += temp * n
        temp = n
    return ans    

print(laser_bank(["011001","001010"])) # 2