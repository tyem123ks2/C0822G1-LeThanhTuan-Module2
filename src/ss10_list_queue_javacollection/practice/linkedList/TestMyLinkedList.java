package ss10_list_queue_javacollection.practice.linkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(12, "Chamber");
        Student student2 = new Student(13, "Reyna");
        Student student3 = new Student(14, "Jinx");
        Student student4 = new Student(15, "Omen");
        Student student5 = new Student(11, "Kiaya");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2, student4);


        System.out.println(myLinkedList.indexOf(student2));

//        myLinkedList.constrains(student2);
//        System.out.println(myLinkedList.constrains(student5));

        // myLinkedList.remove(student3);

//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//
//        for (int i = 0; i < myLinkedList.size(); i++) {
//            Student student = (Student) myLinkedList.get(i);
//            System.out.println(student.getName());
//        }


    }
}
