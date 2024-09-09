class Library: 
    Book = []
    Author = []

    def addAuthor(self, author):
        self.Author.append(author)

    def removeAuthor(self, id):
        for author in self.Author: 
            if author.id == id:
                self.Author.remove(author)
                break

        print(f"Your id {id} not found")

    def printAuthor(self, id):
        for author in self.Author: 
            if author.id == id:
                print(f"Name: {author.name} - email: {author.email}")
                return
        
        print(f"Your id {id} not found")

    def printAllAuthor(self):
        for author in self.Author:
            print(author)

    def addBook(self, book):
        self.Book.append(book)
    
    def removeBook(self, bookid):
        for book in self.Book:
            if book.bookid == bookid:
                self.Book.remove(book)
                break
        print(f"Your id {bookid} not found")

    def printBook(self, bookid):
        for book in self.Book:
            if book.bookid == bookid:
                print(f"Name: {book.title} - Year: {book.year}")
                break
        print(f"Your id {bookid} not found")

    def printAllBook(self):
        for book in self.Book:
            print(book)
        
    # printAllAuthors 
    # addBook
    # removeBook based on the id 
    # printBook based on the id 
    # printAllBooks