import random

randomNumber = random.randint(0, 1000)

print("You get 5 tries to guess the number!!!")


userInput = int(input("Enter a number from 0-10: "))
guess=2

while guess<=5:
    if randomNumber<userInput:
         print("Your number is higher than the number")
         userInput = int(input("Enter another number from 0-10: "))
         guess += 1
    elif randomNumber>userInput:
         print("Your number is lower than the number")
         userInput = int(input("Enter another number from 0-10: "))
         guess += 1
    else:
         print("Congrats! You guessed the right number")
         break

if guess>5:
     print("Too bad, you ran out of guesses!")