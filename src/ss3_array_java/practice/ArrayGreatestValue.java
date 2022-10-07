package ss3_array_java.practice;

import java.util.Scanner;

public class Exam4_array_Greatest_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        int row = 0;
        int column = 0;
        System.out.println("Nhập vào số hàng (row > 0):");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột (column > 0);");
        n = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập vào giá trị phần tử thứ [" + i + "][" + j + "] ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Ma trận vừa nhập vào là: ");
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    column = j;
                    row = i;
                }
            }
            System.out.println();
        }
        System.out.println("giá trị lớn nhất của mảng là: " + max + " tại vị trí là: " + " - Hàng thứ " + row + " Cột thứ " + column);
    }
}

