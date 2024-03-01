package com.dl.one;

/**
 * Create a class hierarchy for different shapes - Circle and Rectangle.
 * Each shape should have a method to calculate its area.
 * Use an interface Shape to define the method calculateArea().
 */

// Abstract class Shape serves as the base class with an abstract method calculateArea().
abstract class Shape {
    abstract double calculateArea();
}

// Rectangle class extends Shape and implements the calculateArea method for rectangles.
class Rectangle extends Shape {
    float length;
    float width;


    // Constructor to initialize the length and width of the rectangle.
    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the calculateArea method for rectangles.
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Circle class extends Shape and implements the calculateArea method for circles.
class Circle extends Shape {
    double radius;

    // Constructor to initialize the radius of the circle.
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the calculateArea method for circles.
    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Main class ShapeTest for testing the shapes and calculating their areas.
public class ShapeTest {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle.
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(5, 15.5f);
        



        // Printing the calculated areas for Circle and Rectangle.
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
