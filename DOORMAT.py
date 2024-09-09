i = input()

i = i.split(" ")

height = int(i[0])
length = int(i[1])

print(height, length)

if height > 5 and height < 101 and length > 15 and length < 303:
    for y in range(height//2):
        a="-"*((length-(3*((2*y)+1)))//2)
        b=".|."*((2*y)+1)
        print(f"{a}{b}{a}")

    d="-"*((length-7)//2)
    print(f"{d}WELCOME{d}")

    for y in reversed(range(height//2)):
        a="-"*((length-(3*((2*y)+1)))//2)
        b=".|."*((2*y)+1)
        print(f"{a}{b}{a}")
    