package ss15_exception.practice.debug1;

import java.util.Scanner;

public class DegreeEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a question as 'ax + b = 0', please: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("b: ");
        double b = Integer.parseInt(scanner.nextLine());

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
