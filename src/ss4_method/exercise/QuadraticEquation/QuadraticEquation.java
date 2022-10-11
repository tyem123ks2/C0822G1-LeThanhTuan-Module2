package ss4_method.exercise.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public String display() {
        return "Bạn đã nhập: {" + "a = " + a + ", b = " + b + " c = " + c + "}";
    }
    public double getDiscriminant() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        return (-this.b + Math.sqrt(delta)) / (2 * this.a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        return (-this.b - Math.sqrt(delta)) / (2 * this.a);
    }
}
