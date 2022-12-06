package giai_thuat;


import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    //Xây dựng 1 hàm nhận vào 1 mảng số nguyên và 1 số nguyên number bất kì. Hàm trả về 1 mảng thỏa mãn điều kiện sau:
    //Nếu number là số lẻ, thì tất cả số chẵn trong mảng sẽ tăng lên 1 đơn vị.Ngược lại nếu
    //number là số chẵn thì tất cả số lẻ trong mảng tăng lên 1 đơn vị. Ngoài ra tất cả các số trong
    //mảng trùng với number sẽ được đổi thành -1. Yêu cầu hiển thị ra màn hình: Mảng số nguyên
    //trước khi thay đổi, số người dùng nhập vào và mảng sau khi thay đổi

    public static void compare(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                arr[i] = -1;
            } else if (number % 2 != 0 && arr[i] % 2 == 0) {
                arr[i] += 1;
            } else if (number % 2 == 0 && arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
        System.out.print("Số muốn kiểm tra là: ");
        int num = Integer.parseInt(scanner.nextLine());
        compare(arr, num);
        System.out.println("Mảng sau khi kiểm tra là: " + Arrays.toString(arr));
    }
}
