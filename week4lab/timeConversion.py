time = int(input("Enter the number of seconds: "))

if time>=0: 
    minutes = time//60
    time %= 60
    hours = minutes//60
    minutes %= 60
    seconds = time%60

    print(f"{hours}:{minutes}:{seconds}")

