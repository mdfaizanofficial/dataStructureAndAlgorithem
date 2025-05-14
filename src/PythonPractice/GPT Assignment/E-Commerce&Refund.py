# 🧩 Challenge: E-Commerce Payment & Refund System
from abc import ABC, abstractmethod

class PaymentMethod(ABC):
    
    @staticmethod
    def authenticate() -> None:
        print("Authenticating...")
    
    @abstractmethod
    def pay(self, amount: int):
        pass

class  Refundable(ABC):

    @abstractmethod
    def refund(self, amount: int):
        pass

class CreditCard(PaymentMethod, Refundable):

    def pay(self, amount: int):
        print(f"Paid {amount} using Credit Card")
    
    def refund(self, amount: int):
        print(f"Refund {(amount//100)*10} to Credit Card")
    
    
class UPI(PaymentMethod):

    def pay(self, amount):
        print(f"Paid {amount} using UPI")


class Paypal(PaymentMethod, Refundable):

    def pay(self, amount: int):
        print(f"Paid {amount} using Paypal")
    
    def refund(self, amount: int):
        print(f"Refund {(amount//100)*10} to Paypal")
    
class CashOnDelivery(PaymentMethod):

    def pay(self, amount):
        print(f"Paid {amount} using Cash On Delivery")

class TransactionProcess:

    id = 101

    def transaction_id(self):
        print("Transaction ID: TXN" + str(TransactionProcess.id))
        TransactionProcess.id += 1

    def process(self, payment_method, amount):
        PaymentMethod.authenticate()
        self.transaction_id()
        payment_method.pay(amount)

        if isinstance(payment_method, Refundable):
            payment_method.refund(amount)
        else:
            print("No Refund Available")

credit_card = CreditCard()
upi = UPI()
paypal = Paypal()
cashondelivery = CashOnDelivery()

transaction1 = TransactionProcess()
transaction1.process(credit_card, 100)
print()
transaction1.process(cashondelivery, 100)

print(end='\n\n')

transaction1.process(upi, 100)
print()
transaction1.process(paypal, 100)