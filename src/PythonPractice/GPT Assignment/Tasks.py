# Question 1
'''answer :
    Bruno
    Bruno says woof!
Explain self.name -> assign the name into class attribute
'''

'''
Question 2
Fixed code -> 
'''
class Laptop:
    def __init__(self,brand, price):
        self.brand = brand
        self.price = price

l1 = Laptop("Dell", 50000)
print(l1.brand)
print(l1.price)

# Correct : assign the value of current object using self keyword

# Question 3
'''
fill the space -> '''
class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return f"{self.name} makes a sound"

class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name)
        self.breed = breed


# Question 4
'''
answers -> 
Generic Vehicle
Bike

explaination -> b.get_type() return bike because b is the object of Bike class
'''

