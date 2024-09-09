class Animal:
    def __init__(self, animalName=""):
        self.animalName = animalName
    
    def displayInfo(self):
        print(f"{self.animalName} is an animal")

class Mammal(Animal):
    def __init__(self, mammalName):
        super().__init__(mammalName)

    def displayInfo(self):
        super().displayInfo()
        print(f"{self.animalName} is a warm-blooded animal")

class NonMarineMammal(Mammal):
    def __init__(self, nonMarineMammalName):
        super().__init__(nonMarineMammalName)

    def displayInfo(self):
        super().displayInfo()
        print(f"{self.animalName} can't swim")

class NonWingedMammal(Mammal):
    def __init__(self, nonWingedMammalName):
        super().__init__(nonWingedMammalName)
    
    def displayInfo(self):
        super().displayInfo()
        print(f"{self.animalName} can't fly")

class Dog(NonMarineMammal, NonWingedMammal):
    def __init__(self):
        super().__init__("Dog")
    
    def getDog(self):
        super().displayInfo()
        print("Dog has 4 legs")

class Bat(NonMarineMammal):
    def __init__(self):
        super().__init__("Bat")
        super().displayInfo()

Test = Dog()
Test.getDog()
print("")
Bat()




