from author import Author
from library import Library
from book import Book

lib = Library()

au1 = Author("JK Rowling", "rowling@gmail.com")
au2 = Author("JK", "gmail.com")

lib.addAuthor(au1)
lib.addAuthor(au2)
lib.printAuthor(au1.id)
lib.printAllAuthor()