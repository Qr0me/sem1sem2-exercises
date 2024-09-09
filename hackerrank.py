import cmath
cn = list(input())
print("".join(cn[5:7]))
if cn[0].isnumeric() and cn[1] == "+":
    print(abs(complex(int(cn[0]), int(cn[2]))))
    print(cmath.phase(complex(int(cn[0]), int(cn[2]))))
    
elif cn[0].isnumeric() and cn[1] == "-":
    print(abs(complex(int(cn[0]), int(cn[2]))))
    print("-",cmath.phase(complex(int(cn[0]), int(cn[2]))), sep="")

elif cn[0] == "-" and cn[2] == "-":
    print(abs(complex(int(cn[1]), int(cn[3]))))
    print("-",cmath.phase(complex(-int(cn[1]), int(cn[3]))),sep="")

elif cn[0] == "-" and cn[2] == "+":
    print(abs(complex(int(cn[1]), int(cn[3]))))
    print(cmath.phase(complex(int(cn[1]), int(cn[3]))))
    
elif cn[1].isnumeric() and cn[2].isnumeric():
    print(abs(complex(int("".join(cn[1:3])), int("".join(cn[4:6])))))
    print(cmath.phase(complex(-int("".join(cn[1:3])), int("".join(cn[4:6])))))