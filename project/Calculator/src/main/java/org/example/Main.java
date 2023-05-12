package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstNumber = 0, secondNumber = 0, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Choose your Operator :");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. ^");
        System.out.println("6. √");
        System.out.println("7. log");
        int choose = 0;
        try {
            choose = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter a valid choice.");
            System.exit(0);
        }

        System.out.println("Please insert your first Number : ");
        try {
            firstNumber = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter a valid number.");
            System.exit(0);
        }

        System.out.println("Now insert Second Number : ");
        try {
            secondNumber = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter a valid number.");
            System.exit(0);
        }

        switch (choose) {
            case 1:
                total = plus(firstNumber, secondNumber);
                System.out.println(firstNumber + " + " + secondNumber + " = " + total);
                break;
            case 2:
                total = minus(firstNumber, secondNumber);
                System.out.println(firstNumber + " - " + secondNumber + " = " + total);
                break;
            case 3:
                total = multiple(firstNumber, secondNumber);
                System.out.println(firstNumber + " * " + secondNumber + " = " + total);
                break;
            case 4:
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");
                    System.exit(0);
                }
                total = divide(firstNumber, secondNumber);
                System.out.println(firstNumber + " / " + secondNumber + " = " + total);
                break;
            case 5:
                total = rank(firstNumber, secondNumber);
                System.out.println(firstNumber + " ^ " + secondNumber + " = " + total);
                break;
            case 6:
                if (firstNumber < 0) {
                    System.out.println("Error: Negative number for square root");
                    System.exit(0);
                }
                total = rootNumber(firstNumber);
                System.out.println("√" + firstNumber + " = " + total);
                break;
            case 7:
                if (firstNumber <= 0 || secondNumber <= 0) {
                    System.out.println("Error: Invalid number for logarithm");
                    System.exit(0);
                }
                total = log(firstNumber, secondNumber);
                System.out.println("log" + firstNumber + " base " + secondNumber + " = " + total);
                break;
            default:
                System.out.println("Invalid Choice. Please enter a valid choice.");
                break;
        }
    }


    public static double log(double a, double b) {
        return Math.log(a) / Math.log(b);
    }

    public static double rootNumber(double a) {
        return Math.sqrt(a);
    }

    public static double rank(double a, double b) {
        return Math.pow(a, b);
    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }
}