# 1. Create a class “Programmer” for storing information of few programmers working at Microsoft.

# class Programmer:

#     def __init__(self, emp_id: int = None, emp_name: str = None, emp_mail: str = None):
#         self.emp_id = emp_id
#         self.emp_name = emp_name
#         self.emp_mail = emp_mail
    
    
#     def get_info(self):
#         print(f"Employee id {self.emp_id}, Employee name {self.emp_name}, Employee mail {self.emp_mail}")
    
# emp = Programmer(101, 'faiz', 'alamfaizan173@gmail.com')
# emp.get_info()

# emp2 = Programmer()
# emp2.emp_id = 102
# emp2.emp_name = 'Faizan'
# emp2.emp_mail = "choudharyboy2003@gmail.com"
# emp2.get_info()
# # print(emp2.__getattribute__("emp_id"))





# 2. Write a class “Calculator” capable of finding square, cube and square root of a number.
# 4. Add a static method in problem 2, to greet the user with hello.

# import math
# class Calculator:

#     def square(self, n:int) -> int:
#         return n**2
    
#     def cube(self, n: int) -> int:
#         return n**3
    
#     def square_root(self, n:int) -> float :
#         return math.sqrt(n)
    
#     @staticmethod
#     def greet():
#         print("Good Morning!!!")
    
# obj = Calculator()
# Calculator.greet()


# while True:
#     n = int(input("Enter number: "))

#     operation = int(input(f"{1} for square, {2} for cube, {3} for square-root : "))

#     match operation:
#         case 1:
#             print(f"Square of {n} is {obj.square(n)}")
#         case 2:
#             print(f"Cube of {n} is {obj.cube(n)}")
#         case 3:
#             print(f"Square-Root of {n} is {obj.square_root(n)}")
    
#     check = input("Enter \"U\" for continue & other for exit: ")
#     if check.lower() != 'u':
#         break



# 3. Create a class with a class attribute a; create an object from it and set ‘a’ directly using ‘object.a = 0’. Does this change the class attribute?

# class Test :
#     a = 10

# obj = Test()
# obj.a = 0

# print(obj.a)

# yes it's make changes b'cozz obj attributes has high prefrence






# 5. Write a Class ‘Train’ which has methods to book a ticket, get status (no of seats) and get fare information of train running under Indian Railways.

# class Train:

#     def __init__(self, seat = 50):
#         self.total_seats = seat

#     def book_a_ticket(self):
#         self.total_seats -= 1
#         print("Seat Booked!")
    
#     def get_status(self):
#         print("Seat Available: ", self.total_seats)
    

# obj = Train(100)

# obj.get_status()
# obj.book_a_ticket()
# obj.get_status()
# obj.book_a_ticket()
# obj.get_status()





# 6. Can you change the self-parameter inside a class to something else (say “harry”). Try changing self to “slf” or “harry” and see the effects.


# class TestSelf:
#     def __init__(faizz, a, b):
#         faizz.a = a
#         faizz.b = b
    
#     def get_info(hello):
#         print(hello.a, hello.b)

# obj = TestSelf(10, 20)
# obj.get_info()

# yes we can change the self keyword, we can use any keyword at first place it will work like self,