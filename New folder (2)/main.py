import name

class main:
    data = []
    def dataCollection(self):
        height = float(input("Height: "))
        weight = float(input("Weight: "))
        person = name.name(height, weight)
        bmi = person.bmiCounter()
        print(f"your BMI is: {bmi}")

main = main()

main.dataCollection()