package ss2_loop_java.practice;

import java.util.Scanner;

public class Is20Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count = 0;
        int countPrime = 0;
        System.out.println("First 20 Prime: ");
        number = input.nextInt();
//        while (number > 20 && number < 0){
//            System.out.println("Try again!!");
//            number = input.nextInt();
//        }
        for (int i = 2; i < 1000; i++) {
            if (countPrime < number) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countPrime += 1;
                }
                count = 0;
            } else {
                break;
            }
        }
    }
}


//    int count = 2, number = 3;
//        System.out.print("First 20 Primes: 2 3");
//                while (count < 20) {
//        number++;
//        boolean checkPrime = true;
//        for (int i = 2; i < number; i++) {
//        if (number % i == 0) {
//        checkPrime = false;
//        }
//        }
//        if (checkPrime) {
//        System.out.print("  " + number);
//        count++;
