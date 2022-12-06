package ss3_array_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
        System.out.println("Nhập vào số muốn chèn");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào vị trí muốn chèn");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index > arr.length - 1) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            System.arraycopy(arr, index, arr, index + 1, arr.length - 1 - index);
            arr[index] = number;
            System.out.println("mảng sau khi thêm phần tử là: " + Arrays.toString(arr));
        }
    }
}
// int[