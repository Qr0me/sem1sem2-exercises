list1 = [10,20,30,40]
list2 = [100,200,300,400]

def printstuff(l1, l2):
    i = 0
    print("output: ")
    while i < len(l1):
        print(l1[i], l2[len(l1)-1-i])
        i += 1

printstuff(list1, list2)