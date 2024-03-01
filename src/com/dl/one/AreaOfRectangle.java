package com.dl.one;
import java.util.Scanner;

/**
 Create a class Rectangle with attributes length and width. Implement a method to calculate the area of the rectangle.
 *
 */

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length and width of the Rectangle: ");
        float l = in.nextFloat();
        float w = in.nextFloat();
        in.close();
        float result = areaOfRectangle(l, w);


        System.out.println("The area of rectangle is "+ result);
    }

    public static float areaOfRectangle(float length, float width) {
        float area = length * width;
        return area;
    }
}