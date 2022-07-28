package com.asbt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String operator;
        double x, y, total;
        //Scanner
        Scanner enter = new Scanner(System.in);
        //Enter values
        System.out.println("Which operation  Sum (+), difference (-) , multiplication (*) or Division (/): ");
        operator = enter.next();
        System.out.println("Enter first number value: ");
        x =  enter.nextDouble();
        System.out.println("Enter the second number value: " );
        y = enter.nextDouble();
        //
        switch (operator) {
            //addition
            case "+":
                total = x + y;
                System.out.printf( x + " + " + y + " = " + total);
                break;
            //difference
            case "-":
                total = x - y;
                System.out.printf( x + " - " + y + " = " + total);
                break;
            //multiplication
            case "*":
                total = x * y;
                System.out.printf( x + " * " + y + " = " + total);
                break;
            //division
            case "/":
                total = x / y;
                if (y == 0) {
                    System.out.println("Operation not supported ");
                } else {
                    System.out.printf(x + " / " + y + " = " + total);
                }
                break;

            default:
                System.out.printf("invalid operator");
                break;
        }
    }
}
