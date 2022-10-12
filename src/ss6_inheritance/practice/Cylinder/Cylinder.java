package ss6_inheritance.practice.Cylinder;

public class Cylinder extends Circle {
    private double height = 2.3;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = "
                + getHeight()
                + " and Volume = "
                + getVolume()
                + super.toString();
    }
}
