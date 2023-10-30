package com.example.java_program;
import java.util.Scanner;
interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

class BasicCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // Not a Number (NaN) signifies an undefined or unrepresentable value
        }
    }
}

public class Simple_Calc {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        Scanner scanner= new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");


            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the Value of 'a' and 'b': ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("Addition: " + calculator.add(a, b));
            }
            else if (choice == 2)
            {
                System.out.print("Enter the Value of 'a' and 'b': ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("Subtraction: " + calculator.subtract(a, b));

            }
            else if(choice==3){
                System.out.print("Enter the Value of 'a' and 'b': ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("Multiplication: " + calculator.multiply(a, b));
            }
            else if(choice==4){
                System.out.print("Enter the Value of 'a' and 'b': ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("Division: " + calculator.divide(a, b));
            }
            else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
