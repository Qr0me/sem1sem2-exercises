AB = int(input("AB: "))
BC = int(input("BC: "))
AC = int(input("AC: "))

if (AB+BC >= AC) and (AB+AC >= BC) and (AC+BC >= AB): 
    print(f"Valid and the perimeter is {AB+BC+AC}")

else:
    print("Invalid")