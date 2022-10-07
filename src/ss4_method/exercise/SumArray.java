package ss4_method.exercise;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        System.out.println("Nhập vào số hàng (row > 0):");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột (column > 0);");
        n = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập vào giá trị phần tử thứ [" + i + "][" + j + "] ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Ma trận vừa nhập vào là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println("\n");
        }

        int column;
        System.out.println("Nhập vị trí cột bạn muốn tính tổng");
        column = Integer.parseInt(scanner.nextLine());
        int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i][column];
            }
            System.out.println(" tổng cần tìm là: " + sum);
        }
    }



