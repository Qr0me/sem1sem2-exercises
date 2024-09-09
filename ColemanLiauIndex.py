def indexCounter(L, S):
    index = (0.0588 * L) - (0.296 * S) - 15.8

    return index

def indexGrade(index):
    if index < 1:
        print("Below Grade 1")
    elif index >= 16:
        print("Grade 16+")
    else:
        print(f"Grade: {round(index)}")

userInput = input("Enter a string: ")
temp = userInput.split(" ")
letters = []
numSentences = 0

for x in temp:
    for i in x:
        if i.isalnum():
            letters.append(i)

for x in temp:
    if "?" in x or "." in x:
        numSentences += 1


L = (len(letters)/len(temp))*100
S = (numSentences/len(temp))*100
idx = indexCounter(L, S)
indexGrade(idx)