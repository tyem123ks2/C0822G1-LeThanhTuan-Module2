package ss15_exception.exercise.illegalTriangleException;

public class TriangleCondition {
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
