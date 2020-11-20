
import java.util.Scanner;

public class SimpleCalculator {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        String operator;

        System.out.println();
        System.out.println("WELCOME TO THE SIMPLE CALCULATOR!");
        System.out.println();

        while (run == true) {

            System.out.println("Please enter which operator you would like to use: + or - or * or / or exit");
            operator = wordscan.nextLine();

            if (operator.equals("+")) {
                System.out.println("Your answer is: " + Add()); //Addition methond
                System.out.println();
            } else if (operator.equals("-")) {
                System.out.println("Your answer is: " + Subtract()); //Subtraction method
                System.out.println();
            } else if (operator.equals("*")) {
                System.out.println("Your answer is: " + Multiply()); //Multiplication Method
                System.out.println();
            } else if (operator.equals("/")) {
                System.out.println("Your answer is: " + Divide()); //Division Method
                System.out.println();
            } else if (operator.equalsIgnoreCase("exit")) {
                System.out.println();
                System.out.println("Thank you, have a great day!"); //Exit
                run = false;
            } else {
                System.out.println("This is not a valid input."); //Random Input
                System.out.println();
            }
        }//end while loop
        
    }//end main

    public static double Add() {
        double num1;
        double num2;
        System.out.println("You chose to add.");
        System.out.print("Enter the first number: ");
        num1 = numscan.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = numscan.nextDouble();
        double result = num1 + num2;  //Calculation
        return result;
    }//end Add

    public static double Subtract() {
        double num1;
        double num2;
        System.out.println("You chose to subtract.");
        System.out.print("Enter the first number: ");
        num1 = numscan.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = numscan.nextDouble();
        double result = num1 - num2;  //Calculation
        return result;
    }//end Subtract

    public static double Multiply() {
        double num1;
        double num2;
        System.out.println("You chose to multiply.");
        System.out.print("Enter the first number: ");
        num1 = numscan.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = numscan.nextDouble();
        double result = num1 * num2;  //Calculation
        return result;
    }//end Multiply

    public static double Divide() {
        double num1;
        double num2;
        System.out.println("You chose to divide.");
        System.out.print("Enter the first number: ");
        num1 = numscan.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = numscan.nextDouble();
        while (num2 == 0) {
            System.out.print("Please enter another value for the second number (not 0): ");  //If zero is placed as a denominator
            num2 = numscan.nextDouble();
        }// end while loop
        double result = num1 / num2;  //Calculation
        return result;
    }//end Divide

}//end class
