package com.company;

class Ferrari implements carFunctions {
    int velocity;

    public Ferrari(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public void showSpeed() {
        System.out.println("Ferrari's speed is " + velocity);
    }

    @Override
    public String turbo() {
        return "Ferrari's max speed is " + velocity * 1.5;
    }
}