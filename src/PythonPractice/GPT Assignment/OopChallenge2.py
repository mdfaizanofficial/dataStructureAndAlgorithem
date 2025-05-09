# 🏦 Challenge: BankAccount Class with Encapsulation

class BankAccount:
    
    def __init__(self, balance: int = 0):
        self.__balance = balance
    
    def deposit(self, amount: int) -> None:
        if amount > 0:
            self.__balance += amount
        else:
            print("Invalid Amount!")
    
    def withdraw(self, amount: int) -> str:
        if(amount > self.__balance):
            print("Insufficient Amount!")
        else:
            self.__balance -= amount

    
    # using getter/setter method
    def get_balance(self) -> int:
        return self.__balance
    
    def set_balance(self, amount) -> None:
        if(amount <= 0):
            print("Invalid Amount!")
        else:
            self.__balance += amount

    # using Decorator 
    @property
    def balance(self) -> int:
        return self.__balance
    
    @balance.setter
    def balance(self, amount: int) -> None:
        if(amount <= 0):
            print("Invalid Amount!")
        else:
            self.__balance += amount


# use getter/setter
account1 = BankAccount()
account1.deposit(100)
print(account1.get_balance())
account1.deposit(200)
print(account1.get_balance())
account1.withdraw(200)
print(account1.get_balance())


# pythonic way use decorator
account2 = BankAccount(100)
account2.deposit(20)
print(account2.balance)
account2.deposit(30)
print(account2.balance)
account2.withdraw(10)
print(account2.balance)

