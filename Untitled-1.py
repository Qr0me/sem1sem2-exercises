LocX = 0
LocY = 0

while True:
    print("CHOOSE YOUR OPTION: \n 1. Location \n 2. Move (Dir and Dist) \n 3. Reset \n 4. Quit ")
    Option = int(input("Input: "))

    if Option == 1:
        print(LocX, LocY)
    elif Option == 2:
        Direction = input("Direction: ")
        Distance = int(input("Distance: "))
        if Direction.upper() == "N":
            LocY += Distance
            print(LocX, LocY)
            print(f"You have moved NORTH by {Distance} units")
        elif Direction.upper() == "E":
            LocX += Distance
            print(LocX, LocY)
            print(f"You have moved EAST by {Distance} units")
        elif Direction.upper() == "W":
            LocX -= Distance
            print(LocX, LocY)
            print(f"You have moved WEST by {Distance} units")
        elif Direction.upper() == "S":
            LocY -= Distance
            print(LocX, LocY)
            print(f"You have moved SOUTH by {Distance} units")
        else:
            print("Direction not specified correctly")
    elif Option == 3:
        LocX = 0
        LocY = 0
        print(LocX, LocY)
    elif Option == 4:
        print("See You Next Time!")
        break
    else: 
        print("NOT A VALID OPTION")