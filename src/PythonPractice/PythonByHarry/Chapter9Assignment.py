# 1. Write a program to read the text from a given file ‘poems.txt’ and find out whether it contains the word ‘twinkle’.


# with open("src/PythonPractice/PythonByHarry/texts/file.txt") as f:
#     find = False

#     line = f.readline()
#     while line != "":
#         if "twinkle" in line:
#             find = True

#         print(line)
#         line = f.readline()
    
#     if find:
#         print("twinkle is found")
#     else:
#         print("twinkle is not found")


# 2. The game() function in a program lets a user play a game and returns the score as an integer. You need to read a file ‘Hi-score.txt’ which is either blank or contains the previous Hi-score. You need to write a program to update the Hi- score whenever the game() function breaks the Hi-score.

# def game(score: int):
#     with open("src/PythonPractice/PythonByHarry/texts/Hi-score.txt") as f:
#         prev_high = f.readline()
#         if prev_high == "":
#             prev_high = 0
#         else:
#             prev_high = int(prev_high)

#         if score > prev_high:
#             with open("src/PythonPractice/PythonByHarry/texts/Hi-score.txt", "w") as f2:
#                 f2.write(str(score))
#             print("High Score Updated!!")
#             print(f"High Score is : {score}")
#         else:
#             print(f"High Score Still: {prev_high}")

# while True:
#     score = int(input("Enter new Score: "))

#     game(score)

#     check = input("Enter U for continue and other for exit: ")
#     if check.lower() != 'u':
#         break




# 3. Write a program to generate multiplication tables from 2 to 20 and write it to the different files. Place these files in a folder for a 13 – year old.

# def table_of(n: int):
#     li = []
#     for i in range(1, 11):
#         li.append(n*i)
    
#     return str(li)

# for i in range(2, 21):
#     with open(f"src/PythonPractice/PythonByHarry/texts/13y_old/{i}", "w") as f:
#         f.write(table_of(i))
#     with open(f"src/PythonPractice/PythonByHarry/texts/13y_old/{i}") as f:
#         print((f.readlines()))



# 4. A file contains a word “Donkey” multiple times. You need to write a program which replace this word with ##### by updating the same file.


# with open("src/PythonPractice/PythonByHarry/texts/donkeyword.txt", "r+") as f:

#     data = f.read()

#     data = data.replace("donkey", "#####")

#     f.seek(0)

#     f.write(data)

#     f.truncate()

#     print("Update")




# 5. Repeat program 4 for a list of such words to be censored.


# with open("src/PythonPractice/PythonByHarry/texts/donkeyword.txt", "r+") as f:
    
#     data = f.read()

#     li = ["don't", "do", "did"]

#     for i in li:
#         data = data.replace(i, "#"*len(i))

#         f.seek(0)

#         f.write(data)

#         f.truncate()



# 6. Write a program to mine a log file and find out whether it contains ‘python’.

# with open("src/PythonPractice/PythonByHarry/texts/file.txt", "r") as f:

#     data = f.read()

#     if 'python' in data.lower():
#         print("Python is Present!")
#         count = data.lower().count("python")

#         print(f"Count of Python is {count}")
#     else:
        


# 7. Write a program to find out the line number where python is present from ques 6.

# with open("src/PythonPractice/PythonByHarry/texts/file.txt", "r") as f:

#     line_no = 0

#     line = f.readline()
    
#     while line != '':
#         if 'python' in line.lower():
#             print("Python present at: ", line_no)
        
#         line = f.readline()
#         line_no += 1


# 8. Write a program to make a copy of a text file “this. txt”

# with open("src/PythonPractice/PythonByHarry/texts/this.txt") as f:

    # data = f.read()

    # with open("src/PythonPractice/PythonByHarry/texts/this_copy.txt", "w") as f2:

    #     f2.write(data)
    
    # print("Copy created!")


# 9. Write a program to find out whether a file is identical & matches the content of another file.

# with open("src/PythonPractice/PythonByHarry/texts/this_copy.txt")  as f:
    
#     data = f.read()

#     with open("src/PythonPractice/PythonByHarry/texts/this.txt") as f2:
        
#         data2 = f2.read()

#         if data == data2 :
#             print("Data is same as copy")
#         else:
#             print("Data is different")



# 10. Write a program to wipe out the content of a file using python.

# with open("src/PythonPractice/PythonByHarry/texts/this_copy.txt", "w") as f:

#     f.write('')

#     print("Data is wipe outed")





# 11. Write a python program to rename a file to “renamed_by_ python.txt.


# import os 
# new_name = "src/PythonPractice/PythonByHarry/texts/this_copy_new.txt";

# old_name = "new_copy.txt"

# os.rename(old_name, new_name)

# os.remove("src/PythonPractice/PythonByHarry/texts/this_copy_new.txt")
# print("file name edited!!")


