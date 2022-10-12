package ss6_inheritance.practice.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.0, "Red", 2.6);
        System.out.println(cylinder);

        cylinder = new Cylinder(6.2, "Orange", 8.2);
        System.out.println(cylinder);
    }
}
