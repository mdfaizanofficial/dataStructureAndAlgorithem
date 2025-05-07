# Assignment 2
class Vehicle:
    def __init__(self, brand: str, model: str):
        self.brand = brand
        self.model = model

    def get_info(self) -> str:
        return f"Brand = {self.brand}, Model = {self.model}"
    
class Car(Vehicle):
    def __init__(self, brand: str, model: str, fuel_type: str):
        super().__init__(brand, model)
        self.fuel_type = fuel_type
    
    def get_info(self):
        return f"Brand = {self.brand}, Model = {self.model}, Fuel = {self.fuel_type}"


car1 = Car("Maruti", "800", "Diesel")

print(car1.get_info())