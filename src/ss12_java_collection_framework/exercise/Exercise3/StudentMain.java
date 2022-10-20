package ss12_java_collection_framework.exercise.Exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Yoru", 25, "Japan");
        Student student2 = new Student("Phoenix", 22, "England");
        Student student3 = new Student("Jett", 24, "Korean");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
            for (Student st : lists){
                System.out.println(st.toString());
            }
        AgeComparator ageComparator = new AgeComparator();
            Collections.sort(lists,ageComparator);
            System.out.println("So sánh theo tuổi");
            for (Student st : lists){
                System.out.println(st.toString());
            }
    }
}