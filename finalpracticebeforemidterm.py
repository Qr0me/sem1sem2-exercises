"""nums = input("Nums: ").split(" ")
target = int(input("Target: "))

def targetFinder(nums, target):
    temp = []
    for x in nums:
        nums.remove(x)
        diff = target-int(x)
        if str(diff) in nums:
            temp.append((diff,x))
            break
    return temp

targetFinder(nums, target)"""

def countWordOccurence(mySentence):
    words = mySentence.split(" ")
    temp = []
    dict = {}
    for x in words:
        if sorted(x) not in temp:
            temp.append(sorted(x))
            dict["".join(sorted(x))] = 1
        else:
            dict["".join(sorted(x))] += 1

    return dict

mySentence = input("Enter a sentence: ")

print(countWordOccurence(mySentence))

