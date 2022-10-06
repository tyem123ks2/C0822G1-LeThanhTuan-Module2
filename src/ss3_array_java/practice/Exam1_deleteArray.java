package ss3_array_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1_deleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(array));
        boolean check = false;
        System.out.print("Nhập số bạn muốn xóa: ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                check = true;
                System.out.println("số muốn xóa nằm ở vị trí " + index);
                System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
                array[array.length - 1] = 0;
                i--;
            }
            index++;
        }
        if (!check) {
            System.out.println("không tồn tại số cần tìm trong mảng");
        } else {
            System.out.println("Mảng sau khi xóa là: " + Arrays.toString(array));
        }
    }
}
