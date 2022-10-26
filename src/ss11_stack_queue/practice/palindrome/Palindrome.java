package ss11_stack_queue.practice.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String text;
        char char1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự cần kiểm tra: ");
        text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char1 = text.charAt(text.length() - i - 1);
            if (text.charAt(i) == char1) {
                System.out.println("Chuỗi kí tự " + text + " - là chuỗi Panlidrome.");
                break;
            } else {
                System.out.println("Chuối kí tự " + text + " - KHÔNG là chuỗi Panlidrome");
                break;
            }
        }
    }
}
