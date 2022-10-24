package ss10_list_queue_javacollection.practice.arrayList;

public class TestMyArrayList {
    public static class Student {
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

    public static void main(String[] args) {
      Student a = new Student(1,"Huy");
      Student b = new Student(2,"Lop");
      Student c = new Student(3,"Kop");
      Student d = new Student(4,"Pik");
      Student e = new Student(5,"Oyh");


     MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.size();

         System.out.println(studentMyArrayList.size());

    }
}
