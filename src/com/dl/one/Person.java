package com.dl.one;
/**Create a class Person with attributes name and age.
 * Implement a method to check if a person is eligible to vote (age >= 18).
 */

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
        if(this.age>=18){
            System.out.println(name + " is eligible for vote");
        }
        else
            System.out.println(name + " is not eligible for vote");
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        new Person(name, age);
    }

}
