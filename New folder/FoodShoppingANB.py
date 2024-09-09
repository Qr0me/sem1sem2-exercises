class FoodShopping:

    # Initializer class that accepts two parameters: food name and amount of food measured in pounds
    def __init__(self, food="", pounds=0):
        self.foodName = food
        self.amountOfFood = pounds
        self.standardPrice = 0
        self.__PriceListANB()
        self.calculatedPrice = self.costCalculationANB()

    #Private method for the prices of each food per pound
    def __PriceListANB(self):
        if self.foodName == "Dry Cured Iberian Ham":
            self.standardPrice = 177.80
        elif self.foodName == "Wagyu Steaks":
            self.standardPrice = 450.00
        elif self.foodName == "Matsutake Mushrooms":
            self.standardPrice = 272.00
        elif self.foodName == "Kopi Luwak Coffee":
            self.standardPrice = 306.50
        elif self.foodName == "Moose Cheese":
            self.standardPrice = 487.20
        elif self.foodName == "White Truffles":
            self.standardPrice = 3600.00
        elif self.foodName == "Blue Fin Tuna":
            self.standardPrice = 3603.00
        elif self.foodName == "Le Bonnotte Potatoes":
            self.standardPrice = 270.81
        else:
            self.standardPrice = 0.00

    #Public method for the calculation of total costs
    def costCalculationANB(self):
        return self.standardPrice * self.amountOfFood
    