package ss11_stack_queue.practice.binary;

import java.util.Stack;

public class BinaryStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        int n = 13;

        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println(stack);
    }
}
