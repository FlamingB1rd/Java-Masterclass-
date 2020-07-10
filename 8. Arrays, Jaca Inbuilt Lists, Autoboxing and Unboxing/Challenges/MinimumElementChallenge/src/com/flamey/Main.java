package com.flamey;

//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//-The method needs to read from the console until all the numbers are entered,
// and then return an array containing the numbers entered.
//-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//-Finally, print the minimum element in the array.

import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter number of integers: ");
        int count = scanner.nextInt();
        System.out.println();
        int[] array = readIntegers(count);

        System.out.println("The minimum number in the array is: " + findMin(array));
    }

    public static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++)
        {
            if(min > array[i]) min = array[i];
        }

        return min;
    }

    public static int[] readIntegers(int count)
    {
        int[] array = new int[count];
        for (int i = 0; i < count; i++)
        {
            System.out.print("Enter number on index " + i + ": " );
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
