package ss1_introduction_java.practice;
import java.util.Scanner;

public class Exam1_helloName {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
