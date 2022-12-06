package giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

//Xây dựng 1 hàm nhận vào 2 mảng bất kì. Nếu mảng thứ 2 là con của mảng thứ nhất thì trả về true,\
// ngược lại trả về false. Ví dụ:
//Mảng thứ nhất [ 1, 2, 3, 4 ] mảng thứ 2 [2, 3] => true.
//Mảng thứ nhất [ 1, 2, 3, 4 ] mảng thứ 2 [3, 2] => false

public class Bai6 {

    public static boolean test(int[] arr, int[] arr1) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr[i]) {
                    count++;
                }
            }
        }
        if (count == arr1.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.print("Nhập số phần tử của mảng: ");
            length = Integer.parseInt(scanner.nextLine());
            if (length <= 0) {
                System.out.println("Độ dài của mảng không phù hợp, vui lòng nhập lại!!! ");
            }

        } while (length <= 0);

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int size1;
        do {
            System.out.print("Nhập số phần tử của mảng: ");
            size1 = Integer.parseInt(scanner.nextLine());
            if (size1 <= 0) {
                System.out.println("Bạn đã nhập độ dài của mảng không phù hợp, vui lòng nhập lại!!! ");
            }

        } while (size1 <= 0);

        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng đầu tiên là: " + Arrays.toString(arr));
        System.out.println("Mảng thứ hai là: " + Arrays.toString(arr1));

        if (test(arr, arr1)) {
            System.out.println("Mảng thứ 2 là con của mảng thứ nhất: " + true);
        } else {
            System.out.println("Mảng thứ 2 không phải là con của mảng thứ nhất: " + false);
        }
    }
}
