package giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    //    Viết 1 hàm nhận vào 1 mảng các số nguyên.
//    Đếm số lần xuất hiện của các phần tử trong mảng
//    đó. Ví dụ:
//            [ 1,2,3,3,2,4] => 1 : 1 lần , 2 : 2 lần, 3: 2 lần, 4: 1 lần
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa tạo là: " + Arrays.toString(arr));
        count(arr,length);
    }

    public static void count(int[] arr, int length) {
        boolean[] array = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (array[i]!=false) {
                continue;
            }
            int count = 0;
            for (int j = i; j < length; j++) {
                if (arr[i] == arr[j]) {
                    array[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " xuất hiện " + count + " lần");
        }
    }
}
