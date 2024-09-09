phonebook = {}
    
while True:
    print("1. Add new contact")
    print("2. Delete contact")
    print("3. Show all contacts")
    print("4. Quit")
    userOpt = int(input("Enter your option:"))

    if userOpt == 1:
        name = input("Name: ")
        email = input("Email: ")
        phone = input("Phone Number: ")
        contactInfo = {'Email': email, 'PhoneNumber':phone}
        phonebook[name] = contactInfo
    elif userOpt == 2:
        if len(phonebook) != 0:
            nameToRemove = input("Enter name to be removed: ")
            while nameToRemove not in phonebook:
                print("Name not in phonebook")
                nameToRemove = input("Enter name to be removed: ")

            del(phonebook[nameToRemove])

        else:
            print("---Phonebook is empty---")
    elif userOpt == 3:
        if len(phonebook) != 0:
            for name, contactInfo in phonebook.items():
                print(f"Name: {name}")
                print(f"Email: {contactInfo['Email']}")
                print(f"Phone Number: {contactInfo['PhoneNumber']}")
                print("-----------------------------------------------")
        else:
            print("---Phonebook is empty---")
    elif userOpt == 4:  
        print("See you next time!")
        break
    else:
        print("INVALID INPUT")