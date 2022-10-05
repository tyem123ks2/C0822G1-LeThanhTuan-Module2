package ss1_introduction_java.exercise;

import java.util.Scanner;

public class Ex6_leap_year_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm muốn kiểm tra năm nhuận: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            }
        }
        if (isLeapYear) {
            System.out.println("Năm " + year + " là năm nhuận!");
        } else {
            System.out.println("Năm " + year + " KHÔNG phải là năm nhuận!");
        }
    }
}
