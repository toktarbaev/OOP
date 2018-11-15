package com.company;

public class Main {

    public static void main(String[] args) {
        Car A6 = new Audi(200);
        A6.setSpeed(180);
        System.out.println(A6.showSpeed());

        Ferrari fer = new Ferrari(210);
        fer.showSpeed();
        System.out.println(fer.turbo());
    }
}