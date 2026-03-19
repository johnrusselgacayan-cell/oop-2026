package com.cell;

import java.util.ArrayList;

import com.cell.abs.GeometricObject;
import com.cell.model.Circle;
import com.cell.model.Rectangle;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> list = new ArrayList<>();

        Circle c1 = new Circle(5, "Blue", true);
        Circle c2 = new Circle(3, "Black", false);

        System.out.println("Circle equal: " + c1.equals(c2));

        Rectangle r1 = new Rectangle(1.0, 3.0);
        Rectangle r2 = new Rectangle(2.0, 4.0);

        System.out.println("Rectangle equal: " + r1.equals(r2));
    }
}