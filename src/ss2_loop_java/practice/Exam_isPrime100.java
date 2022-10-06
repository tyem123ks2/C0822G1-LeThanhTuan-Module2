package ss2_loop_java.practice;

public class Exam_isPrime100 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        //;
        String primeNumber = "";
        for (i = 1; i <= 100; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                primeNumber = primeNumber + i + " ";
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến 100 là: ");
        System.out.println(primeNumber);
    }
}
