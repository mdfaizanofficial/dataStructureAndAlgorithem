# 1. Write a program using functions to find greatest of three numbers.

# def find_greatest(n1: int, n2: int, n3: int) -> int:
#     if n1 > n2 and n1 > n3:
#         return n1
#     elif n2 > n1 and n2 > n3:
#         return n2
#     else:
#         return n3
    
# n1 = int(input("Enter first Number: "))
# n2 = int(input("Enter second Number: "))
# n3 = int(input("Enter third Number: "))

# print(find_greatest(n1, n2, n3))


# 2. Write a python program using function to convert Celsius to Fahrenheit.

# formula (c*9/5)+32

# def cal_to_f(c):
#     return (c*9/5)+32

# print(cal_to_f(40))



# 3. How do you prevent a python print() function to print a new line at the end.

# print("The new line depend on end, end is internally set end='\\n' ", end="\n")



# 4. Write a recursive function to calculate the sum of first n natural numbers.

# def sum(n):
#     if n == 1:
#         return 1
#     return n+sum(n-1)

# print(sum(10))



# 5. Write a python function to print first n lines of the following pattern:
# ***
# **    -for n = 3
# *


# def print_pattern(n: int):
#     if n == 1:
#         print("*")
#         return

#     print("*" * n)
#     print_pattern(n-1)

# print_pattern(3)



# 6. Write a python function which converts inches to cms.

# 2.54
# def inch_to_cm(inches):
#     return inches*2.54

# print(inch_to_cm(4))



# 7. Write a python function to remove a given word from a list ad strip it at the same time.

# def remove_ad(s, word):
    
#     li = s.split(" ")

#     if word in li:
#         li.remove(word)
#     else:
#         print("word is not in list!!")

#     return " ".join(li)

# s = "Write a python function to remove a given word from a list ad strip it at the same time."
# print(remove_ad(s, "python"))
    


# 8. Write a python function to print multiplication table of a given number.

# def multiply(n: int):
#     for i in range(1, 11):
#         print(n*i)

# multiply(3)
