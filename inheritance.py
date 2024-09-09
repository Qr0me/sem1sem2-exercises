import math
class Circle:
    def __init__(self, radius=1.0, color='red'):
        self.__radius = radius
        self.__color = color

    def getRadius(self):
        return self.__radius

    def setRadius(self, radius=1.0):
        if radius > 0:
            self.__radius = radius

    def getColor(self):
        return self.__color
    
    def setColor(self, color='red'):
        self.__color = color

    def __str__(self):
        return f'Circle: Radius: (self.__radius) Color: (self.__color)'
    
    def getArea(self):
        return math.pi * math.pow(self.__radius, 2)
    
class Cylinder(Circle):
    def __init__(self, height=1.0, radius=1.0, color='red'):
        Circle.__init__(self, radius, color)
        self.__height = height

    def __str__(self):
        return f'Cylinder: Radius: (super().getRadius()) Color: (super().getColor())'