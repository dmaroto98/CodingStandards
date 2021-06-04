// Copyright (C) 2020
// All rights reserved

package labcodingstandards;

import java.util.Scanner;

/**
 * @author DayseMarotoLema
 *
 */
public class Calculator {
//CHECKSTYLE:OFF
/**
 * @param args
 */
    public static void main(final String[] args) {
//CHECKSTYLE:ON
        Scanner reader = new Scanner(System.in);

        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");

        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;

        while (true) {
            System.out.print("Enter first number: ");
            input = reader.nextLine();

            try {
    first = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        while (true) {
            System.out.print("Enter second number: ");
            input = reader.nextLine();

            try {
                second = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.operation(first, second, operator);

        System.out.printf(result);
        reader.close();
    }

/**
 * @param f first
 * @param s second
 * @param op operation
 * @return result the result of the operation
 */
    private String operation(final double f, final double s, final char op) {
        double result = 0;
        switch (op) {
            case '1':
                result = f + s;
                break;
            case '2':
                result = f - s;
                break;
            case '3':
                result = f * s;
                break;
            case '4':
                result = f / s;
                break;
            default:
                return "Error! operator is not correct";
        }
        return "The result is: " + result;
    }
}
