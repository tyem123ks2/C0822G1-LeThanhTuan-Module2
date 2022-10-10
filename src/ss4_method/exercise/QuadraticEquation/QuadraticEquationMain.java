package ss4_method.exercise.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Tham số bạn nhập: " + quadraticEquation.display());

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Delta = " + quadraticEquation.getDiscriminant() + " > 0");
            System.out.println("Phương trình có 2 nghiệm: " + "\n" + "x1 = " + quadraticEquation.getRoot1() + "\n" + "x2 = " + quadraticEquation.getRoot2());

        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Delta = " + quadraticEquation.getDiscriminant());
            System.out.println("Phương trình có 1 nghiệm kép:" + "\n" + "x1 = x2 = " + quadraticEquation.getRoot1());

        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Delta = " + quadraticEquation.getDiscriminant() + " < 0");
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
