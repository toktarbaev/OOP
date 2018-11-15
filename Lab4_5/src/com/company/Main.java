package com.company;

public class Main {
    public static void main(String[] args) {
        int [] arr = {0, 8, -3, 20};
        MinMax.Pair p = MinMax.minmax(arr);
        System.out.print(p.getFirst()+" ");
        System.out.print(p.getSecond());
    }
}