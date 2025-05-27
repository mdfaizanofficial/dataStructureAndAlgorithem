# f = open("src/PythonPractice/file.txt", "w")
# f.write("This is for write")
# f2 = open("src/PythonPractice/file.txt", "r")
# data = f2.read()
# print(data)
# f.close()
# f2.close()

f = open("src/PythonPractice/PythonByHarry/texts/file.txt")

line = f.readline()
while(line != ""):
    print(line)
    line = f.readline()