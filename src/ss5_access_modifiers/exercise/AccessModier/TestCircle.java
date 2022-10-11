package ss5_access_modifiers.exercise.AccessModier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle.setColor("green");
        Circle.setRadius(3);
        System.out.println(circle.toString());

    }
}
