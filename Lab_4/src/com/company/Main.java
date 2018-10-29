package com.company;

public class Main {

    public static void main(String[] args) {
        Shapes cylinder= new Cylinder(7, 6);
        Shapes sphere = new Sphere(5.5);
        Shapes cube = new Cube (6);

        //(Cylinder) cylinder).setRadius(7);
        System.out.println(cylinder.surfArea());
        System.out.print(cylinder.volume());
    }
}