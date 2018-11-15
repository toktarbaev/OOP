package com.company;

class Audi extends Car
{
    int speed;

    public Audi(int speed)
    {
        super(speed);
    }

    @Override
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getSpeed()
    {
        return speed;
    }

    public String showSpeed()
    {
        return "This car's speed is "+getSpeed();
    }
}
