package giai_thuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    //Viết 1 hàm nhận vào 1 số nguyên duy nhất hàm
    //trả về mảng số nguyên từ 0 đến số được truyền
    //vào và phải thỏa mãn 2 yêu cầu: thứ nhất số đó
    //thuộc dãy fibonacci , thứ 2 số đó phải là số nguyên tố. In ra mảng đấy

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hãy nhập một số bất kì: ");
            int number = Integer.parseInt(scanner.nextLine());
            display(number);
        }

        public static void display(int number) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <= number; i++) {
                if (isPrime(i) && isFibonacy(i)) {
                    list.add(i);
                }
            }
            for (Integer value : list) {
                System.out.println(value);
            }
        }

        public static boolean isPrime(int number) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            return check;
        }

        public static boolean isFibonacy(int number) {
            int a = 1;
            int b = 1;
            boolean check = false;
            int sum;
            for (int i = 0; i <= number; i++) {
                sum = a + b;
                a = b;
                b = sum;
                if (sum == number) {
                    check = true;
                }
            }
            return check;
        }
    }
