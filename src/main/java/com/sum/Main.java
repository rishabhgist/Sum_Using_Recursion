package com.sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }

    public int sumOfNumber(int number) {
        if (number == 0) {
            return number;
        }
        return number + sumOfNumber(number - 1);
    }
}