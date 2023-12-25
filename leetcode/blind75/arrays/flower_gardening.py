def canPlaceFlower(flowerbed, n):
    # edge cases
    if len(flowerbed) == 1 and flowerbed[0] == 0:
        return True
    if len(flowerbed) == 1 and flowerbed[0] == 1:
        return False
    new_flower = 0
    x = 0
    for i in range(len(flowerbed)):
        # Edge cases
        if i == 0 and flowerbed[i] == 0 and flowerbed[i+1] == 0:
            n -= 1
        if i == len(flowerbed)-1 and flowerbed[i] == 0 and flowerbed[i-1] == 0:
            n -= 1
        # Middle cases
        if flowerbed[i] == 0:
            new_flower += 1
        if flowerbed[i] == 1:
            new_flower = 0
        if new_flower >= 3:
            if new_flower == 3 or new_flower == (x+2):
                x = new_flower
                n -= 1                         
    return n <= 0
