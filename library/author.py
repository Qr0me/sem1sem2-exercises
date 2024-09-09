class Author: 
    author_id = 0

    def __init__(self, name, email):
        Author.author_id += 1
        self.id = Author.author_id
        self.name = name
        self.email = email

    def setName(self, name):
        self.name = name
    
    def setEmail(self, email):
        self.email = email

    def getName(name):
        return name
    
    def getEmail(email):
        return email
    

    