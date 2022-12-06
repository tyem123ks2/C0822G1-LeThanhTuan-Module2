package readFile;

import ss16_textfile.exersice.readFile.model.Country;

import java.io.*;

import java.util.List;

public class Test {
    public static void main(String[] args) {
       FileServer1 fileServer1 = new FileServer1();
       List<Posts> postsList = null;
       try {
           postsList = fileServer1.readFile("src\\readFile\\data\\posts.csv");
           postsList.add(new Posts("03", "Valorant1","They have no idea1", "S1ub", 112000));
           fileServer1.writeFile("src\\readFile\\data\\posts1.csv", postsList);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}