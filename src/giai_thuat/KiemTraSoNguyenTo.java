package giai_thuat;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
//    Viết 1 hàm nhận vào 1 số nguyên bất kì, hiển thị các số không phải là sô nguyên tố từ 0 đến số đấy

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int dem = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    dem++;
                }
            }
            if (!(dem == 2)) {
                System.out.println(i);
            }

        }
    }
}

