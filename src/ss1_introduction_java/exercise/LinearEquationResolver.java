package ss1_introduction_java.exercise;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextFloat();
        System.out.println("Enter c: ");
        double c = scanner.nextFloat();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else if (b == c) {
            System.out.println("The solution is all x!");
        } else {
            System.out.println("No solution.");
        }
    }
}
