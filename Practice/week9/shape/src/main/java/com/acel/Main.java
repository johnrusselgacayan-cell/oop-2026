package com.acel;

import com.acel.model.GeometricObject;
import com.acel.model.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 2, 2);
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        
        GeometricObject g = new GeometricObject() {
        };
        System.out.println("Color: " + g.getColor());
        System.out.println("Filled: " + g.isFilled());

        System.out.println();

        Triangle triangle2 = new Triangle(5, 5, 5);
        System.out.println(triangle2.toString());
        System.out.println("Area: " + triangle2.getArea());
        System.out.println("Perimeter: " + triangle2.getPerimeter());

        GeometricObject g2 = new GeometricObject() {
        };
        System.out.println("Color: " + g2.getColor());
        System.out.println("Filled: " + g2.isFilled());

    }
}