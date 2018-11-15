package com.company;

import java.util.Arrays;

class MinMax
{

    public static class Pair
    {
        private int first, second;
        public Pair(int f, int s)
        {
            first = f;
            second = s;
        }

        public int getFirst()
        {
            return first;
        }

        public int getSecond()
        {
            return second;
        }
    }

    public static Pair minmax(int[] values)
    {
        Arrays.sort(values);
        int min=values[0];
        int max=values[values.length-1];
        return new Pair(min,max);
    }
}