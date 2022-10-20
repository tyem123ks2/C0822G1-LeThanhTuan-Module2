package ss11_stack_queue.practice.Reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
    Stack<Integer> numbers = new Stack<>();
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập phần tử thứ " + i + ":");
                arr[i] = Integer.parseInt(scanner.nextLine());
                 numbers.push(arr[i]);
        }
        System.out.println("Mảng vừa nhập là: " + "\n" + Arrays.toString(arr));
        System.out.println("Mảng đảo ngược là: ");
        for (int i = 0; i < size; i++) {
            arr[i] = numbers.pop();
        }
        System.out.println(Arrays.toString(arr));

       Stack<String> wStack = new Stack<>();
        System.out.println("Nhập vào một chuỗi: ");
        String string = scanner.nextLine();
        String[] array = string.split("");
            for (int i = 0; i < array.length; i++) {
                wStack.push(array[i]);
            }
        //System.out.println(wStack);
        String string1 = "";
            for (int i = 0; i < array.length; i++){
                string1 += wStack.pop();
            }
        System.out.println("Chuỗi đảo ngược lại là: " + "\n" + string1);
    }
}

