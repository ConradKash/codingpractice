def reverseVowels(s):
    vowels = ['a','e','i','o','u','A','E','I','O','U']
    sarray = list(s)
    for i in range(len(sarray)):
        if sarray[i] in vowels:
            for j in range(len(sarray)-1,i,-1):
                if sarray[j] in vowels:
                    sarray[i], sarray[j] = sarray[j], sarray[i]
                    break
    return ''.join(sarray)

print(reverseVowels('hello'))