# 1 write a program to create a dictonary of hindi words with the value of their english translation. Provide user with an option to look it up.


# dictonary = {
#     "Paani": "Water",
#     "Pankha": "Fan",
#     "Kholna":"Open"
# }

# while True:
#     key = input(f"Type any word to Translate: {dictonary.keys()} ").capitalize()
#     print(f"{key} -> {dictonary.get(key)}")
#     print("Type \'stop\' to Exit and any key to continue: ")
#     check = input()
#     if check == "stop":
#         print("Have a nice day!!")
#         break



# 2. Write a program to input eight numbers from the user and display all the unique numbers (once).

# s1 = set()

# for i in range(8):
#     val = int(input(f"Enter {i+1} number: "))
#     s1.add(val)

# print(s1)



# 3. Can we have a set with 18 (int) and '18' (str) as a value in it?

# s2 = {18, '18'}
# print(s2) // yes



# 4. What will be the length of following set s:
# s = set()
# s.add(20)
# s.add((20.0))
# s.add('20') # length of s after these operations?

# print(s, len(s))


# 5. What is the type of 's'?
# s = {}
# print(type(s))


# 6. Create an empty dictionary. Allow 4 friends to enter their favorite language as value and use key as their names. Assume that the names are unique.

dic = {}

for i in range(4):
    name = input("Enter Name: ")
    language = input("Enter Language: ")

    # 1)
    # dic[name] = language

    # 2)
    dic.update({name: language})

print(dic.items())