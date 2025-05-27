# 1. Create a class (2-D vector) and use it to create another class representing a 3-D vector.

class TwoDVector:
    def __init__(self, i, j):
        self.i = i
        self.j = j


    def get_info(self):
        return f"i = {self.i}, j = {self.j}"

class ThreeDVector(TwoDVector):

    def __init__(self, i, j, k):
        super().__init__(i, j)
        self.k = k
    
    def get_info(self):
        return f"i = {self.i}, j = {self.j}, k = {self.k}"

o = TwoDVector(2, 3)
o2 = ThreeDVector(2, 3, 4)

print(o.get_info())
print(o2.get_info())





# 2. Create a class ‘Pets’ from a class ‘Animals’ and further create a class ‘Dog’ from ‘Pets’. Add a method ‘bark’ to class ‘Dog’.





# 3. Create a class ‘Employee’ and add salary and increment properties to it.w rite a method ‘salaryAfterIncrement’ method with a @property decorator with a setter which changes the value of increment based on the salary.


# 4. Write a class ‘Complex’ to represent complex numbers, along with overloaded operators ‘+’ and ‘*’ which adds and multiplies them.



# 5. Write a class vector representing a vector of n dimensions. Overload the + and * operator which calculates the sum and the dot(.) product of them. 6. Write __str__() method to print the vector as follows: 7i + 8j +10k Assume vector of dimension 3 for this problem.
    

# 7. Override the __len__() method on vector of problem 5 to display the dimension of the vector.