class Animal:
    def speak(self):
        return "Some Sound."

class Dog(Animal):
    def speak(self):
        return "Dog says Woof!"

class Cat(Animal):
    def speak(self):
        return "Cat says Meow!"
class Cow(Animal):
    def speak(self):
        return "Cow says Moo!"

class Robot:
    def speak(self):
        return "Beep Boop!"

def make_it_speak(obj):
    return obj.speak()

objs = [Dog(), Cat(), Cow(), Robot()]

for obj in objs:
    print(f"Speaking: {make_it_speak(obj)}")
