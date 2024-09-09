bill = float(input("Enter amount of bill: "))
num_of_people = int(input("Enter number of people: "))
tip = float(input("Enter amount of tip (%): "))

tipPerson = round((((tip/100)*bill)/num_of_people), 2)

print(f"Tip amount per person ${tipPerson}")
print(f"Total amount per person ${round((tipPerson+(bill/num_of_people)), 2)}")