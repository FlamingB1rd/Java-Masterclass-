package com.flamey;

import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
	    int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is: " + average(myIntegers));
    }

    public static int[] getIntegers(int number)
    {
        System.out.println("Enter " + number + " integer numbers: \r");
        int[] values = new int[number];
        for(int i= 0; i < values.length; i++)
        {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double average(int[] array)
    {
        double sum = 0;
        for(int i = 0; i < array.length; i ++)
        {
            sum += array[i];
        }
        return sum/array.length;
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Array position " + i + " holds a value of " + array[i]);
        }
    }
}
