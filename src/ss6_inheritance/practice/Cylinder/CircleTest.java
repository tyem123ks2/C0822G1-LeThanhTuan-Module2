package ss6_inheritance.practice.Cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(1.2, "");
        System.out.println(circle);

        circle = new Circle(3.5, "Blue");
        System.out.println(circle);
    }
}
