package com.company;

class Cylinder implements Shapes
{
    double radius, height;

    public Cylinder(double radius, double height)
    {
        this.radius=radius;
        this.height=height;
    }
    /*public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }*/
    @Override
    public double surfArea()
    {
        return 2*PI*radius*height+2*(PI*Math.pow(radius,2));
    }
    @Override
    public double volume()
    {
        return PI*Math.pow(radius,2)*height;
    }
}
