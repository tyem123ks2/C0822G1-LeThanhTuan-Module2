package ss4_method.exercise.Fan;

public class Fan {
    static final int slow = 1;
    static final int medium = 2;
    static final int fast = 3;
    int speed = slow;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "speed: " + this.speed + " ,color: " + this.color + " ,radius: " + this.radius + " ,fan is on";
        } else {
            return "speed: " + this.speed + " ,color: " + this.color + " ,radius: " + this.radius + " ,fan is off";
        }
    }

}