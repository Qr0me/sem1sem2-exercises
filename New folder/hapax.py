import os

myFile = open("book.txt", "r")
allLine= myFile.read()


def hapaxFinder(myBook):
    hapaxDict = {}
    for word in myBook.split(" "):
        if word.isalnum():
            if word.lower() in hapaxDict:
                hapaxDict[word.lower()] += 1
            
            else: 
                hapaxDict[word.lower()] = 1

    hapaxList = []
    for word in hapaxDict:
        if hapaxDict[word] == 1:
            hapaxList.append(word)
    
    print(sorted(hapaxList))


hapaxFinder(allLine)




