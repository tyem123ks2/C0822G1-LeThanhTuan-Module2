package ss4_method.exercise;

import java.util.Scanner;

public class Pactice2_sumArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.println("Nhập số lượng hàng của ma trận: ");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng cột của ma trận: ");
        n = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập vào giá trị phần tử thứ [" + i + "][" + j + "] ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println("\n");
        }

        int sum = 0;
        int sum1 = 0;
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                    if (i == j) {
                        sum += arr[i][j];
                    }
                    if ( j == arr[i].length - 1){
                        sum1 += arr[i][arr.length - 1 - i];
                    }
                }
            }
        System.out.println("Tổng của đường chéo chính: " + sum +" hoặc " + sum1);


    }
}
