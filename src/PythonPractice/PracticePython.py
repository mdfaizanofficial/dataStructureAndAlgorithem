print("Hello python.")
# while True:
#     print("Hello",end="\t")

def printSomething(str: str, k: int) -> str:
    res = ""

    for i in range(1, k+1):
        res += str
    return res
def printSomething2(str, k):
    res = ""

    for i in range(1, k+1):
        res += str
    return res

ans = printSomething("Hello", 10)
print(ans)

ans2 = printSomething2("Hello", 10)
print(ans2)