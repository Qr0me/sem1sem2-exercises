dlr = float(input("Change Owed: "))

cent = dlr * 100
i = 0

while cent-25 >= 0 :
    cent-=25
    i+=1

while cent-10 >= 0:
    cent-=10
    i+=1

while cent-5 >= 0:
    cent-=5
    i+=1

while cent-1 >= 0:
    cent-=1
    i+=1

print("Output:",i)