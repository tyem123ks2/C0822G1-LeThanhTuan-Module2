package ss6_inheritance.exercise.demo2;

public class Person {
    private int id;
    private String name;
    public final int MAX_STUDENT = 5;

    public void getInfo() {
    }

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
