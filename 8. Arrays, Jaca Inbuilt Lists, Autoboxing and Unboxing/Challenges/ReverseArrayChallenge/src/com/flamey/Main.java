package com.flamey;

//-Write a method called reverse() with an int array as a parameter.
//-The method should not return any value. In other words, the method is allowed to modify the array parameter.
//-In main() test the reverse() method and print the array both reversed and non-reversed.
//-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//Tip:
//	-Create a new console project with the name ЃeReverseArrayChallengeЃf

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("The array's length is: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Enter the value of index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("The array is: " + Arrays.toString(array));
        reverse(array);

        System.out.println("The reversed array is: " + Arrays.toString(array));
    }

    public static void reverse (int[] array)
    {
        int temp = 0;
        for(int i = 0; i < array.length / 2; i++)
        {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
