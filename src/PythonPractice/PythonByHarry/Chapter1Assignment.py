# 1 Write a program to print Twinkle Twinkle little star poem in python

# poem = '''
#     Twinkle Twinkle little star,
#     Twinkle Twinkle little star.
# '''
# print(poem)


# 2 Use REPL and print the table of 5 using it.

# faizan-furqan-ahmad@faizan-furqan-ahmad-Latitude-E5450:~$ python3
# Python 3.12.3 (main, Feb  4 2025, 14:48:35) [GCC 13.3.0] on linux
# Type "help", "copyright", "credits" or "license" for more information.
# >>> for i in range(1, 10+1):
# ...     print(5*i)
# ... 
# 5
# 10
# 15
# 20
# 25
# 30
# 35
# 40
# 45
# 50
# >>> 


# 3 Install an external module and use it to perform an operation of your interest





# 4 write a python program to print the contents of a directory using the os module. Search online for the function which does that.

# import os
# def print_directory_contents(directory_path):
#     try:
#         contents = os.listdir(directory_path)
#         print(directory_path)

#         for item in contents:
#             print(item)
#     except FileNotFoundError:
#         print("file not found")


# if __name__=="__main__":
#     target_directory = input("Enter Directory: ")
    
#     print_directory_contents(target_directory)


# 5 Label the  program written in problem 4 with comments
import os

# path the directory
contents_path = "/"

# list the directory
contents = os.listdir(contents_path)

# print the directory
print(contents)


