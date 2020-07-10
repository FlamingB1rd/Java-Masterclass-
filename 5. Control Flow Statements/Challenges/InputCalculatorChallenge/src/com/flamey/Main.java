package com.flamey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int counter = 0;
        int number;

        while(true)
        {
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt)
            {
                number = scanner.nextInt();
                sum += number;
                counter++;
            }
            else
            {
                avg = (double) sum / counter;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                break;
            }
        }

        scanner.close();
    }
}
