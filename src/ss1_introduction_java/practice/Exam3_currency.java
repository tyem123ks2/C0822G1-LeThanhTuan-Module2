package ss1_introduction_java.practice;

import java.util.Scanner;

public class Exam3_currency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập giá trị USD cần quy đổi sang VNĐ: ");
        usd = sc.nextDouble();
        double exchange = usd * vnd;
        System.out.println(usd + " USD quy đổi ra bằng: " + exchange + " VNĐ.");
    }
}
