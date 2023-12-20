def mergeAlternatively(nums1, nums2):
    i = 0
    j = 0
    res = []
    
    while i < len(nums1) and j < len(nums2):
        res.append(nums1[i])
        res.append(nums2[j])
        i += 1
        j += 1
        
    while i < len(nums1):
        res.append(nums1[i])
        i += 1
        
    while j < len(nums2):
        res.append(nums2[j])
        j += 1

    results = "".join(res)    
    print(results)
    return results
        

# Creating two arrays of letters with a minimum of 8 letters each
array1 = ['a', ' ','b', 'c', 'd', 'e', 'f', 'g', 'h']
array2 = ['i', 'j', 'k', 'l', 'm', 'n',' ', 'o', 'p']

mergeAlternatively(array1, array2)
