def canPlaceFlower(flowerbed, n):
    # edge cases
    if len(flowerbed) == 1 and flowerbed[0] == 0:
        return True
    if len(flowerbed) == 1 and flowerbed[0] == 1:
        return False
    new_flower = 0
    for i in range(len(flowerbed)):        
        if flowerbed[i] == 0:
            new_flower += 1
        print( flowerbed[i], n)
        print(new_flower)  
                  
        if new_flower/2 == 0:
            n -= 1
            new_flower = 0  
             
    if n == 0:
        return True
    else:
        return False
    
if __name__ == "__main__":
    flowerbed = [1,0,0,0,1,0]
    n = 2
    print(canPlaceFlower(flowerbed, n))