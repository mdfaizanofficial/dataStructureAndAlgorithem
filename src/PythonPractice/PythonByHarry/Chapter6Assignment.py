# 1. Write a program to find the greatest of four numbers entered by the user.

# n1 = int(input("Enter first Number: "))
# n3 = int(input("Enter third Number: "))
# n4 = int(input("Enter fourth Number: "))
# n2 = int(input("Enter second Number: "))

# if n1 > n2 and n1 > n3 and n1 > n4:
#     print(f"{n1} is greater.")
# elif n2 > n1 and n2 > n3 and n2 > n4:
#     print(f"{n2} is greater.")
# elif(n3 > n1 and n3 > n2 and n3 > n4):
#     print(f"{n3} is greater.")
# else:
#     print(f"{n4} is greater")



# 2. Write a program to find out whether a student has passed or failed if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

# eng = int(input("Enter English Marks: "))
# hin = int(input("Enter Hindi Marks: "))
# mat = int(input("Enter Mathematics Marks: "))

# total_percentage = ((eng+hin+mat)/300)*100

# if total_percentage < 40 or eng < 33 or hin < 33 or mat < 33 :
#     print("Failed!!")
# else:
#     print("Passed.")




# 3. A spam comment is defined as a text containing following keywords: “Make a lot of money”, “buy now”, “subscribe this”, “click this”. Write a program to detect these spams.


# comment = "This is a spam comment in subscribe this buy this paragraph including"

# spams = ["Make a lot of money", "buy now", "subscribe this", "click this"]

# for i in range(len(spams)):
#     if spams[i] in comment:
#         print("This is a spam comment.")
#         break
# else:
#     print("No Spam")



# 4. Write a program to find whether a given username contains less than 10 characters or not.

# username = 'alamfaiza'

# if len(username) < 10:
#     print("Lesser than 10")
# else:
#     print("Not lesser than 10")





# 5. Write a program which finds out whether a given name is present in a list or not.

# li = [3,4,5,3,2,4,5,6,5,4,3,3,4,5,42,2423,545,3242,54,34,5,46,4,6345,424,634,65,34]

# num = int(input("Enter number: "))

# if num in li:
#     print("Number is present")
# else:
#     print("Number is not present")





# 6. Write a program to calculate the grade of a student from his marks from the
# following scheme:
# 90 – 100 => Ex
# 80 – 90 => A
# 70 – 80 => B
# 60 – 70 =>C
# 50 – 60 => D
# <50 => F

# marks = [90, 80,54,65,75]

# percentage = sum(marks)/len(marks)
# grade = None

# if percentage > 90 and percentage <= 100:
#     grade = "EX"
# elif percentage > 80 and percentage <= 90:
#     grade = "A"
# elif percentage > 70 and percentage <= 80:
#     grade = "B"
# elif percentage > 60 and percentage <= 70:
#     grade = "C"
# elif percentage >= 50 and percentage <= 60:
#     grade = "D"
# elif percentage < 50:
#     grade = "F"

# print(grade)



# 7. Write a program to find out whether a given post is talking about “Harry” or not.



post = "This is a post something about the harry or not in this we can say it is a mind blowing starting point"

if "harry" in post:
    print("Yes")
else:
    print("No")