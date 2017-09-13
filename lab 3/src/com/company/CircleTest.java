package com.company;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        // write your code here
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = key.nextFloat();
        Circle c = new Circle(radius);
        System.out.println("Enter your desired output:  'A' for area    'C' for circumference    'D' for diameter: ");
        String req = key.next();

        double area = c.getArea();
        double circumference = (2*3.14159265*radius);
        double diameter = 2*radius;

        if(req.equalsIgnoreCase(("A")))
            System.out.println("The area of the circle with radius " + radius + " is " + area);

        else if(req.equalsIgnoreCase("C"))
            System.out.println("The circumference of the circle with radius " + radius + " is " + circumference);

        else if(req.equalsIgnoreCase("D"))
            System.out.println("The diameter of the circle with radius " + radius + " is " + diameter);
        else
            System.out.println("You did not enter a valid Letter");

    }
}