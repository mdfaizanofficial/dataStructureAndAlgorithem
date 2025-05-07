# Challenge 1
class Student:
    def __init__(self, name:str, marks: list):
        self.name = name
        self.marks = marks
    
    def calculate_percentage(self) -> float:
        sum = 0

        for mark in self.marks:
            sum += mark

        return sum/len(self.marks)
    
    def get_info(self) -> str:
        return f"Student: {self.name}, Percentage: {self.calculate_percentage()}%"
    

student1 = Student("faizan", [45, 58, 57, 61, 42, 60, 45])

print(student1.get_info())


# Challenge 2

class Employee:
    def __init__(self, name: str, salary: int):
        self.name = name
        self.salary = salary

    def get_info(self) -> str:
        return f"Name: {self.name}, Salary: ₹{self.salary}"

class Manager(Employee):
    def __init__(self, name, salary, department):
        super().__init__(name, salary)
        self.department = department
    def get_info(self):
        return f"Name: {self.name}, Salary: ₹{self.salary}, Department: {self.department}"
    
m1 = Manager("Anjali", 75000, "HR")
print(m1.get_info())
    