package com.sum;

import java.util.Scanner;

public class SumUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get sum till number");
        int number = input.nextInt();

        SumUsingRecursion obj = new SumUsingRecursion();

        int sum = obj.sumOfNumber(number);
        System.out.println("The sum is : " + sum);

    }

    /**
     * If the number is 0, return 0, otherwise return the number plus the sum of the number minus 1.
     *
     * @param number The number to be summed up.
     * @return The sum of all the numbers from 0 to the number passed in.
     */
    public int sumOfNumber(int number) {
        if (number == 0) {
            return number;
        }
        return number + sumOfNumber(number - 1);
    }
}