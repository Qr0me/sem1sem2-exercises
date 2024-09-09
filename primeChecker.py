num = int(input("Number: "))

if num <= 1:
    print(f"{num} isn't prime")
elif num>1:
    for x in range(2, num):
        if (num % x) == 0:
            print(f"{num} isn't prime")
            break
    else:
        print(f"{num} is prime")

        # adrian basuki 2702298210