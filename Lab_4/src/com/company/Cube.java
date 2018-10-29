package com.company;

class Cube implements Shapes
{
    double length;
    public Cube(double length)
    {
        this.length=length;
    }

    @Override
    public double surfArea()
    {
        return 6*Math.pow(length,2);
    }
    @Override
    public double volume()
    {
        return Math.pow(length,3);
    }
}
