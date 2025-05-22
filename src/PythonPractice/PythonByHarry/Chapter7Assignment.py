# 1. Write a program to print multiplication table of a given number using for loop.

# n = int(input("Enter number: "))

# for i in range(1, 11):
#     print(f"{n} x {i} = {n*i}")



# 2. Write a program to greet all the person names stored in a list ‘l’ and which starts with S. l = ["Harry", "Soham", "Sachin", "Rahul"]

# l = ["Harry", "Soham", "Sachin", "Rahul"]
# for name in l:
#     if name.lower().startswith("s"):
#         print("Good Mornint",name)



# 3. Attempt problem 1 using while loop.

# n = int(input("Enter number: "))
# i = 1
# while i <= 10:
#     print(f"{n} x {i} = {n*i}")
#     i += 1



# 4. Write a program to find whether a given number is prime or not.


# while True:
#     n = int(input("Enter number: "))

#     i = 2

#     while(i * i <= n):
#         if n % i == 0:
#             print("Not prime")
#             break
#         i += 1
#     else:
#         print("num is prime")


# 5. Write a program to find the sum of first n natural numbers using while loop.


# n = int(input("Enter your num: "))

# sum_n = 0

# i = 1
# while i <= n:
#     sum_n += i
#     i+=1
# print(sum_n)




# 6. Write a program to calculate the factorial of a given number using for loop.

# n = 5

# fact = 1
# for i in range(1, n+1):
#     fact = fact*i
# print(fact)



# 7. Write a program to print the following star pattern.
#   *
#  ***
# ***** for n = 3

# for i in range(1, 4):
#     for j in range(1, 4-i):
#         print(" ", end="")
#     for j in range(1, 2*i):
#         print("*", end="")
#     print("")
    

# 8. Write a program to print the following star pattern:
# *
# **
# *** for n = 3

# for i in range(1, 4):
#     for j in range(1, i+1):
#         print("*", end="")
#     print()


# 9. Write a program to print the following star pattern.
# ***
# * * for n = 3
# ***

# for i in range(1, 4):
#     for j in range(1, 4):
#         if(i != 1 and i != 3 and j != 1 and j != 3 and i == j):
#             print(" ", end="")
#         else:
#             print("*", end="")
#     print()



# 10. Write a program to print multiplication table of n using for loops in reversed order.

# n = int(input("Enter number: "))

# for i in range(10, 0, -1):
#     print(n*i)