def laser_bank(floor):
    # Your code here
    laser = 0
    for  m in range(len(floor)):
        for n in range(len(floor[m])):
            if floor[m][n] == 1:
                for p in range(len(floor[m+1])):
                    floor[p][n] = 1
                    laser += 1
                
        
    return laser

print(laser_bank(["011001","001000"])) # 2