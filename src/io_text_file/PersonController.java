package io_text_file;

import java.io.IOException;
import java.util.*;

public class PersonController {
    public static final String PATH = "src\\io_text_file\\demo.csv";
    public static void main(String[] args) {

//        Person person1 = new Person("Nga Ngố", new Date("1991/01/01"));
//        Person person2 = new Person("Sỹ", new Date("1992/01/01"));
//        Person person3 = new Person("Kim Minh", new Date("1993/01/01"));
//        Set<Person> personSet = new TreeSet<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if(o1.getDate().compareTo(o2.getDate()) < 0){
//                    return -1;
//                } else if (o1.getDate().compareTo(o2.getDate()) > 0) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        personSet.add(person3);
//        personSet.add(person1);
//        personSet.add(person2);
//        for(Person person: personSet){
//            System.out.println(person.toString());
//        }

        Person person = new Person("Nga ngố","codegym");
        ReadWrite.write(person,PATH,true);
        Person person1 = new Person("Minh béo","codegym2");
        ReadWrite.write(person1,PATH,true);
        List<Person> personList = null;
        try {
            personList = ReadWrite.readWrite(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (personList != null) {
            for(Person p: personList){
                System.out.println(p.toString());
            }
        }

    }
}
