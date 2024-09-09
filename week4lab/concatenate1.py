list1 = ["M", "na", "i", "Ke"]
list2 = ["y", "me", "s", "lly"]
mylist = []

def append(l1, l2, l):
    i = 0 

    while i < len(l1):
        l.append(f"{l1[i]}{l2[i]}")

        i+=1

append(list1, list2, mylist)
print(mylist)