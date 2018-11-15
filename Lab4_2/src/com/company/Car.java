package com.company;

abstract class Car{
    int speed;

    public Car(int speed)
    {
        this.speed=speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getSpeed()
    {
        return speed;
    }

    abstract String showSpeed();
}