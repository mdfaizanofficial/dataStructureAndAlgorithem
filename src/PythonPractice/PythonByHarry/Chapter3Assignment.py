# 1 write a python program to display a user entered name followed by good afternoon with help of input() function

# def display(name: str) -> None:
#     print(f"Good Afternoon {name}")

# name = input("Enter your name: ")
# display(name)

# 2 write a python program to fill in a letter template given below with the name and date

# letter = '''
#         Dear <|Name|>,
#         You are selected!
#         <|Date|>
#         '''

# print("Template-> ", letter)
# name = input("Enter your name: ")
# date = input("Enter Date: ")
# letter = letter.replace("<|Name|>", name)
# letter = letter.replace("<|Date|>", date)

# print("Your Letter -> ", letter)


#  3 write a program to detect double space in a string

# string = "I'm a fastastic  boy with no  attitude"

# idx = string.find("  ")
# print(idx)



#  4 replace the double space from problem 3 to a single space

# string = "I'm a fastastic  boy with no  attitude"

# string = string.replace("  ", " ")
# print(string)


# 5 write a program to format the following letter using escape sequence characters.

letter = "Dear Harry,\nthis python course is nice.\n\'Thanks\'"
print(letter)