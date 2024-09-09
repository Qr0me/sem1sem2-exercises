snakecase = input("Enter: ")
for i in snakecase:
    if i.isupper():
        snakecase=snakecase.replace(i, f"_{i.lower()}")
print(snakecase)