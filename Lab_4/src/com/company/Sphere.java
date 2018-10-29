package com.company;

class Sphere implements Shapes{
    double radius;
    public Sphere(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double surfArea()
    {
        return 4*PI*Math.pow(radius,2);
    }
    @Override
    public double volume()
    {
        return 4/3*PI*Math.pow(radius,3);
    }
}