package ss3_array_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmallValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là " + min);
    }
}
