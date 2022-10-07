package ss1_introduction_java.exercise;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập vào số cân nặng của bạn: ");
        weight = scanner.nextDouble();
        System.out.println("Nhập vào số chiều cao của bạn (m): ");
        height = scanner.nextDouble();
        bmi = weight / (height * height);
        if (bmi < 18) {
            System.out.println("Chỉ số BMI của bạn là: " + bmi + " - Bạn thiếu cân!");
        } else if (bmi < 25.0) {
            System.out.println("Chỉ số BMI của bạn là: " + bmi + " - Bạn bình thường!");
        } else if (bmi < 30.0) {
            System.out.println("Chỉ số BMI của bạn là: " + bmi + " - Bạn thừa cân!");
        } else {
            System.out.println("Chỉ số BMI của bạn là: " + bmi + " - Bạn béo phì!");
        }
    }
}
