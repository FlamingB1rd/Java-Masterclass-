package com.flamey;

import com.example.series.Series;

public class Main {

    public static void main(String[] args)
    {
        int result1 = Series.nSum(10);
        int result2 = Series.factorial(10);
        int result3 = Series.fibonacci(11);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
