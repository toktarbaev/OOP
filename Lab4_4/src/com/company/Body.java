package com.company;

class Body implements Flyable{
    @Override
    public String move()
    {
        return "this object can move";
    }
    @Override
    public String fly()
    {
        return "this object can fly";
    }
}