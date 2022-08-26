package com.sum;

import java.util.Scanner;

public class SumUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get sum till 0");
        int number = input.nextInt();

        SumUsingRecursion obj = new SumUsingRecursion();

    }

    public int sumOfNumber(int number) {
        if (number == 0) {
            return number;
        }
        return number + sumOfNumber(number - 1);
    }
}