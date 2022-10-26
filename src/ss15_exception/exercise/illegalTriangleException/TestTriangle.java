package ss15_exception.exercise.illegalTriangleException;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleCondition triangleCondition = new TriangleCondition();

        try {
            System.out.println("Nhập vào 3 cạnh của tam giác ABC: ");
            System.out.println("Nhập cạnh a: ");
            double a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh b: ");
            double b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh c: ");
            double c = Integer.parseInt(scanner.nextLine());
            try {
                checkTriangleEdges(a, b, c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Sai: Không đúng định dạng");
        }
    }

    private static void checkTriangleEdges(double a, double b, double c) throws
            TriangleEdgesException {
        if (a < 0 || b < 0 || c < 0) {
            throw new TriangleEdgesException("Lỗi: Cạnh của tam giác phải lớn hơn 0.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Lỗi: Hai cạnh của tam giác bé hơn hoặc bằng cạnh còn lại");

        } else {
            System.out.println("Đây là 3 cạnh của tam giác");
        }
    }

}
