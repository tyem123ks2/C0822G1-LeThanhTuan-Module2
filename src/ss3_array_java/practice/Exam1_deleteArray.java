package ss3_array_java.practice;

import java.util.Scanner;

public class Exam1_deleteArray {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        size = scanner.nextInt();
        int i = 0;
        array = new int[size];
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("MẢng vừa nhập là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
