package ss14_sort.exercise.InsertionSortDemo;

import java.util.Scanner;

public class InsertionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ lớn của mảng (size): ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " của mảng: ");
            list[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập của bạn là: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\n");
        insertionDemo(list);
    }

    public static void insertionDemo(int[] list) {
        int pos;
        int x;
        for (int i = 1; i < list.length; i++) { //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
        System.out.println("Mảng vừa được sửa lại là: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }

    }

}
