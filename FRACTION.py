import math

num = int(input("Enter a numerator: "))
while num <= 0:
    num = int(input("Please re-enter another numerator value: ")) 
den = int(input("Enter a denominator: "))
while den <= 0:
    den = int(input("Please re-enter another denominator value: "))

gcd = math.gcd(num, den)

if num < den:
    print(f"{num}/{den} is a proper fraction")
    if gcd != 1:
        print(f"This proper fraction can be reduced to: {num//gcd}/{den//gcd}")

else:
    print(f"{num}/{den} is an improper fraction")
    if den != 1:
        print(f"This improper fraction can be reduced to: {num//gcd}/{den//gcd}")
        if den//gcd != 1:
            print(f"The mixed number is: {(num//gcd)//(den//gcd)} and {(num//gcd)%(den//gcd)}/{den//gcd}")
        elif den//gcd == 1:
            print(f"The whole number is {num//gcd}")

    else:
        print("This improper fraction can't be reduced any further.")
        print(f"The whole number is {num}")