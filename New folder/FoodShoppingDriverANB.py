#Imports class from FoodShoppingANB file
from FoodShoppingANB import FoodShopping

#Function to accept user inputs and creates a list of objects (returns it as well)
def addToCartANB():

    #Empty list for objects based on user input
    listOfFoods = []
    numberOfFoods = int(input("How many items will you order today? "))

    #Checks if number of food input is valid (above 1)
    while numberOfFoods<1:
        print("Number of items must be at least 1")
        numberOfFoods = int(input("How many items will you order today? "))

    #Starts loop in range of the number of food the customer wants to add to their cart
    for i in range(numberOfFoods):

        #Title for each food order
        print(f"Item #{i+1}-")

        #Defining name of food
        nameOfFood = input("Enter food name: ").title()

        #Defining amount of pounds of food
        foodAmount = float(input("Enter amount of pounds: "))

        #Checks if the foodAmount value is above 0
        while foodAmount <= 0 :
            foodAmount = float(input("Enter amount of pounds (Number must be greater than 0): "))

        #Adds a newly created object to the list
        listOfFoods.append(FoodShopping(nameOfFood, foodAmount))
    
    return listOfFoods


# Displays the contents of the list (attributes of each object in the list) 
def shoppingCartANB(listOfFood):
    print("Here's a summary of the items purchased:")
    print("---------------------------")
    
    #Loops over list of objects
    for foodData in listOfFood:

        #prints data for food names and amount of food in pounds
        print(f"Item: {foodData.foodName}")
        print(f"Amount ordered: {foodData.amountOfFood} lbs")

        #round Standard Price to 2DP, then prints the standard price
        standardPrice = "{:.2f}".format(foodData.standardPrice)
        print(f"Price per pound: ${standardPrice}")

        #round Calculated Price to 2DP, then prints the calculated price
        calculatedPrice = "{:.2f}".format(foodData.calculatedPrice)
        print(f"Price of order: ${calculatedPrice}")
        print(" ")

# Calculates total cost of food        
def totalCostCalculatorANB(listOfFood):
    totalPrice = 0

    #Loop that iterates over the list of objects
    for foodData in listOfFood:
        totalPrice += foodData.calculatedPrice
        totalPriceRounded = "{:.2f}".format(totalPrice)
    print(f"Total cost: ${totalPriceRounded}")

# Main function to run the three functions aobve
def startFunctionANB():
    listOfFood = addToCartANB()
    shoppingCartANB(listOfFood)
    totalCostCalculatorANB(listOfFood)

startFunctionANB()