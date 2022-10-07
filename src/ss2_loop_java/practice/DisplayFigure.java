package ss2_loop_java.practice;

import java.util.Scanner;

public class Exam1_displayFigure {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("* ");
                    System.out.println("* * ");
                    System.out.println("* * * ");
                    System.out.println("* * * * ");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("      * ");
                    System.out.println("    * * * ");
                    System.out.println("  * * * * * ");
                    System.out.println("* * * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    ;
            }
        }
    }
}