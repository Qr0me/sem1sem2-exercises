class Account:
    def __init__(self, init__bal=0):
        self.__bal = init__bal

    def getBal(self):
        return self.__bal
    
    def deposit(self, amt):
        if amt>0:
            self.__bal += amt
            return True
        return False
    def withdraw(self, amt):
        if amt <= self.__bal and amt>0:
            self.__bal -= amt
            return True
        return False
    
class Customer:
    def __init__(self, firstName="", lastName="", account=Account()):
        self.__firstName = firstName
        self.__lastName = lastName
        self.__account = account

    def getFirstName(self):
        return self.__firstName
    
    def getLastName(self):
        return self.__lastName
    
    def getAccount(self):
        return self.__account
    
    def setAccount(self, account):
        self.__account = account

class Bank:

    def __init__(self, bName=""):
        self.__bName = bName
        self.__numberOfCustomer = 0
        self.__customers = []

    def getNumOfCustomers(self):
        return self.__numberOfCustomer

    def addCustomer(self, firstName, lastName):
        self.__customers.append(Customer(firstName, lastName))
        self.__numberOfCustomer += 1

    def getCustomer(self, customerIndex):
        return self.__customers[customerIndex]

        
bank = Bank("A")

bank.addCustomer("A", "B")
bank.addCustomer("C", "D")
bank.addCustomer("E", "F")
print(bank.getNumOfCustomers())
print(bank.getCustomer(2).getFirstName())



