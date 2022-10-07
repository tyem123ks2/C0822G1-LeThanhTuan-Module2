package ss4_method.exercise;

import java.util.Scanner;

public class Pactice3_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "They have no idea how heartless I am!";
        System.out.println(str);
        System.out.println("Nhập vào ký tự cầm tìm ở chuỗi trên: ");
        char[] arr = str.toCharArray();
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (char item : arr) {
            if (item == character) {
                count++;
            }
        }
        System.out.println("Ký tự đã nhập xuất hiện " + count + " lần");
    }
}
