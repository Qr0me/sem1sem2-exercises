list1 = ["Hello", "take"]
list2 = ["Dear", "Sir"]

myList = []

def append(l1,l2,l):
    for x in l1:
        for y in l2:
            l.append(f"{x} {y}")

append(list1, list2, myList)
print(myList)