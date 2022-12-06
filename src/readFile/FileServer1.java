package readFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileServer1 {
    public List<Posts> readFile(String path) throws IOException {
        List<Posts> postsList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] info = line.split(",");
                Posts posts = new Posts();
                posts.setId(info[0]);
                posts.setTitle(info[1]);
                posts.setSubtitle(info[2]);
                posts.setContent(info[3]);
                posts.setViews(Integer.parseInt(info[4]));
                postsList.add(posts);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        return postsList;
    }
    public void writeFile(String path, List<Posts> postsList) {
        List<String> strings = new ArrayList<>();
        for (Posts post : postsList) {
            strings.add(post.convertLine());
        }
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : strings) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}