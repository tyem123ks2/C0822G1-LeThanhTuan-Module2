package io_text_file;

import java.util.Date;

public class Person {
    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String writeToCSV() {
        return this.name + "," + this.address;
    }
    //    public Person(String name, Date date) {
//        this.name = name;
//        this.date = date;
//    }
//
//    public Person() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", date=" + date +
//                '}';
//    }

//    @Override
//    public int compareTo(Person o) {
//        if(this.getDate().compareTo(o.getDate()) < 0){
//            return 1;
//        }else if (this.getDate().compareTo(o.getDate()) >0) {
//            return -1;
//        }else {
//            return 0;
//        }
//        return this.getDate().compareTo(o.getDate());
//    }
}
