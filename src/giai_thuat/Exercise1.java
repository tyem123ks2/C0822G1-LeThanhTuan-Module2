package giai_thuat;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        String primeNumber = "";
        String notPrimeNumber = "";
        for (i = 2; i < 100; i++) {
            int count = 0;
            for (num = 1; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count > 2) {
                notPrimeNumber = notPrimeNumber + i + " ";
            }
        }
        System.out.println("Các số không phải số nguyên tố từ 1 đến 100 là");
        System.out.println(notPrimeNumber);
    }

}
