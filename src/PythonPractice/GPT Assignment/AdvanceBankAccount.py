# 🧩 Challenge: Advanced BankAccount System

class AdvBankAcc:
    total_accounts = 0

    def __init__(self, name: str, balance: int = 0):
        AdvBankAcc.total_accounts += 1
        self.__acc_no = "AC"+str(1000+AdvBankAcc.total_accounts)
        self.__name = name
        self.__balance = balance
    
    def deposit(self, amount: int) -> None:
        if AdvBankAcc.is_valid_amount(amount):
            self.__balance += amount
            print("Account Balance: ",self.__balance)
        else:
            print("Invalid Amount!")
    
    def withdraw(self, amount: int) -> None:
        if AdvBankAcc.is_valid_amount(amount):
            if amount <= self.__balance:
                self.__balance -= amount
            else:
                print("Insufficient Balance!")
        else:
            print("Invalid Amount")

    def transfer_to(self, other_acc, amount: int) -> None: 
        if not AdvBankAcc.is_valid_amount(amount):
            print("Invalid Amount!")
            return
        if self.__balance < amount:
            print("Insufficient Balance!")
            return
            
        self.__balance -= amount
        other_acc.__balance += amount

        print(f"Transfer Successfull: {amount} from Account: {self.__acc_no} to Account: {other_acc.__acc_no}");

    def get_info(self) -> str:
        return f"Account: {self.__acc_no}, Name: {self.__name}, Balance: {self.__balance:.2f}, Interest: {AdvBankAcc.calculate_interest(self.__balance, 5):.2f}"
    
    @staticmethod
    def total_account() -> str:
        return f"Total Accounts: {AdvBankAcc.total_accounts}"
    @staticmethod
    def calculate_interest(balance: int, percentage: int) -> float:
        return (balance/100)*percentage
    @staticmethod
    def is_valid_amount(amount: int) -> bool:
        return amount > 0
    

adv_acc1 = AdvBankAcc("Faizan", 1000)
adv_acc1.deposit(100)
print(adv_acc1.get_info())



adv_acc2 = AdvBankAcc("Rahul", 2000)
print(adv_acc2.get_info())
print(AdvBankAcc.total_account())

adv_acc2.transfer_to(adv_acc1, 1000)
print(adv_acc1.get_info())