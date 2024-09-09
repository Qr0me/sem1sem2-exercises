def removePunctuation(word):
    list = []
    for i in word:
        if i.isalnum():
            list.append(i)
    return "".join(list)

def countWordOccurence(mySentence):
    words = mySentence.split(" ")
    temp = []
    dict = {}
    for x in words:
        if x not in temp:
            x = removePunctuation(x)
            temp.append(x)
            dict[x] = 1
        else:
            dict[x] += 1

    return dict

def countCharOccurence(mySentence):
    dict = {}
    for i in mySentence:
        dict[i] = dict.get(i, 0)+1
    return dict

mySentence = input("Enter a sentence: ")

print(countWordOccurence(mySentence))
print(countCharOccurence(mySentence))
