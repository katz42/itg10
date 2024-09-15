package main.java.ezhidkova.week07;

import java.util.HashMap;
import java.util.Map;

public class charactersCount {
    public static void charactersCount(String sentence){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : sentence.toCharArray()) { // преобразование строки в символы
            if (!map.containsKey(c)){
                map.put(c, 1);
            } else {
                int count = map.get(c) + 1;
                map.put(c, count);
            }
        }
        for (Map.Entry<Character, Integer> element : map.entrySet()) {
            System.out.println(element);
        }
    }

    public static void main(String[] args){
        String helloWorld = "Hello World";
        charactersCount(helloWorld);
    }
}
