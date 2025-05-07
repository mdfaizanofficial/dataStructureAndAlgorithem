# Assignment 1
class Book:
    title:None
    author:None
    price:None

    def __init__(self, title: str, author: str, price: int):
        self.title = title
        self.author = author
        self.price = price

    def get_info(self) -> str:
        return f"Title = {self.title}, Author = {self.author}, Price = {self.price}";

book1 = Book("Atomic Habit", "James Clear", 199)
book2 = Book("Ignited Mind", "Dr apj", 299)

print(book1.get_info())
print(book2.get_info())
