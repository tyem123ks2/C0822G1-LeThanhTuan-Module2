package ss16_textfile.exersice.copyFileTest;

import java.io.*;

public class CopyFileTest {
    public static String readFile(String pathFile) {
        File file = new File(pathFile);
        String str = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                str += line;
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Số ký tự có trong chuỗi là: " + str.length());
        return str;
    }

    public static void writeFile(String pathFile, String string) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFileTest.writeFile("src\\ss16_textfile\\exersice\\copyFileTest\\data.dat\\target.txt",
                readFile("src\\ss16_textfile\\exersice\\copyFileTest\\data.dat\\source.txt"));
        System.out.println();
    }
}


//    public static void copyAll(File f1, File f2) {
//        try {
//            //Copy bản thân nó?
//            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        if (f1.isDirectory()) {
//            //Copy các thư mục con?
//            File[] mangCon = f1.listFiles();
//            for (File file : mangCon) {
//                File file_new = new File(f2.getAbsoluteFile() + "/" + file.getName());
//                copyAll(file, file_new);
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        File file = new File("src/ss16_textfile/exersice/copyFileTest/data.dat");
//        File file_copy = new File("src/ss16_textfile/exersice/copyFileTest/data_copy");
//        CopyFileTest.copyAll(file, file_copy);
//        System.out.println("Copy thành công!!");


//        InputStream inStream = null;
//        OutputStream outStream = null;
//        try {
//            inStream = new FileInputStream(new File("src/ss16_textfile/exersice/copyFileTest/data.dat/JackeyLove.txt"));
//            outStream = new FileOutputStream(new File("src/ss16_textfile/exersice/copyFileTest/data.dat/Gumayusi.txt"));
//            int length;
//            byte[] buffer = new byte[1024];
//            while ((length = inStream.read(buffer)) > 0) {
//                outStream.write(buffer, 0, length);
//
//            }
//            System.out.println("File is copied successful!!");
//            System.out.println();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            inStream.close();
//            outStream.close();
//        }
