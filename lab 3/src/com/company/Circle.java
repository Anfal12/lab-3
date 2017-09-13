package com.company;

import java.util.Scanner;

public class Circle {
    private static float PI = 3.14159265f;
    float radius;
    public Circle(float radius) {

        this.radius=radius;

    }
    public double getArea() {
        return  PI*radius*radius;
    }

    public double getcircumference(){
        return (2*PI*radius);
    }

    public double getdiameter(){
        return 2*radius;
    }
}