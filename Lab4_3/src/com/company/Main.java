package com.company;

public class Main {

    public static void main(String[] args) {
        Person man = new Manager("Meder", 40000, "qwe123", 5.5);
        Person man2 = new Manager("Kuanysh", 40000, "asd456", 4.5);
        System.out.println(man.toString());
        System.out.println(man2.toString());
        //((Manager) man).CompareTo(man2);
        //((Manager) man).clone();
        // write your code here
    }
}