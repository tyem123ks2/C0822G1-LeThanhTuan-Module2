package ss1_introduction_java.practice;

import java.util.Scanner;

public class Exam2_read {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc (n>0, n<1000): ");
        int number = scanner.nextInt();
        if (number >= 0 && number <10) {
            switch (number) {
                case 0:
                    System.out.println("Không");
                    break;
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
                default:
                    System.out.println("Out of ability!");
            }
        }
    }
}
