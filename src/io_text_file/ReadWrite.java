package io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static void write(Person person, String path, boolean writeMode) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path,writeMode));
            bufferedWriter.write(person.writeToCSV());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<Person> readWrite(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Person> list = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] str = line.split(",");
            list.add(new Person(str[0], str[1]));
        }
        bufferedReader.close();
        return list;
    }
}
