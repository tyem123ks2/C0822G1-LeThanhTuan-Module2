package ss11_stack_queue.practice.Count;

import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public void count() {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
        System.out.println("Nhập vào một chuỗi: ");
        String string = scanner.nextLine().toUpperCase();
        String[] array = string.split(" ");
        String key;
        int value;
        for (int i = 0; i < array.length; i++) {
            key = array[i];
            if (map1.containsKey(key)) {
                value = map1.get(key);
                map1.put(key, ++value);
            } else {
                map1.put(key, 1);
            }
        }
        System.out.println(map1);
    }
}
