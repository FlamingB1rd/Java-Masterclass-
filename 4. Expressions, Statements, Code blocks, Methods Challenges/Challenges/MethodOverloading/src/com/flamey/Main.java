package com.flamey;

import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        int score = calculateScore("Ivo", 9999);
        System.out.println("Score with multiplier bonuses: " + score);

        int blankScore = calculateScore(9999);
        System.out.println("Score with multiplier bonuses: " + blankScore);

        calculateScore();

        System.out.println("--------------------- CHALLENGE! ---------------------");
        System.out.printf("%.4f\n", calcFeetAndInchesToCantimeters(6, 1));
        System.out.printf("%.0f", calcFeetAndInchesToCantimeters(25));

    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " has a score of: " + score);
        return score * 1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Blank has a score of: " + score);
        return score * 1000;
    }

    public static void calculateScore()
    {
        System.out.println("No player name or score");
    }

    //----------------------------------------- CHALLENGE PART ---------------------------------------------

    public static double calcFeetAndInchesToCantimeters(double feet, double inches)
    {
        if(feet < 0 || (inches < 0 || inches > 12))
        {
            return -1;
        }
        double totalInches = feet * 12 + inches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCantimeters(double inches)
    {
        if(inches < 0)
        {
            return -1;
        }

        double feet = inches / 12;
        return feet;
    }
}
