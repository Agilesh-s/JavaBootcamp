package com.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, x, y;
        while (true){
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            num = input.nextInt();
            System.out.print("Enter number 1: ");
            x = input.nextInt();
            System.out.print("Enter number 2: ");
            y = input.nextInt();


            switch (num){
                case 1:
                    System.out.println("Addition of two numbers: " + (x+y));
                    break;
                case 2:
                    System.out.println("Subtraction of two numbers: " + (x-y));
                    break;
                case 3:
                    System.out.println("Multiplication of two numbers: " + (x*y));
                    break;
                case 4:
                    System.out.println("Division of two numbers: " + (x/y));
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
