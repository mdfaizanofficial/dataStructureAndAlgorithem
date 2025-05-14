# 🧩 Challenge: Payment System using Abstraction
from abc import ABC, abstractmethod
class Payment(ABC):

    @abstractmethod
    def pay(self, amount: int):
        pass

class CreditCard(Payment):
    
    def pay(self, amount: int) -> str:
        return f"Paid {amount} using CreditCard"
    
class UPI(Payment):
    
    def pay(self, amount: int) -> str:
        return f"Paid {amount} using UPI"

def make_payment(payment_method: Payment, amount: int):
    return payment_method.pay(amount)

upi = UPI()

creditcard = CreditCard()

# print(make_payment(creditcard, 1000))
# print(make_payment(upi, 500))




# 🧩 Challenge: Create a Multi-Payment System

class PaymentMethod(ABC):

    @staticmethod
    def authenticate() -> None:
        print("Authenticating user....")

    @abstractmethod
    def pay(self, amount: int) -> str:
        pass

class Refundable(ABC):
    @abstractmethod
    def refund(self, amount: int) -> str:
        pass

class CreditCardMethod(PaymentMethod, Refundable):
    
    def pay(self, amount):
        return f"Paid {amount} using Credit Card"
    
    def refund(self, amount: int):
        return f"Refunded {amount//2} to Credit Card"
    
class UPIMethod(PaymentMethod):
    
    def pay(self, amount):
        return f"Paid {amount} using UPI"
    
def process_transaction(payment_method: PaymentMethod, amount: int) -> str:
    PaymentMethod.authenticate()
    pay_res = payment_method.pay(amount)
    if isinstance(payment_method, Refundable):
        return pay_res +"\n"+ payment_method.refund(amount)
    else:
        return pay_res

creditcardmethod = CreditCardMethod()

upimethod = UPIMethod()

print(process_transaction(creditcardmethod, 1000), end='\n\n')

print(process_transaction(upimethod, 500))
