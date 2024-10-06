package main.java.ezhidkova.week09;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class olderThanFour {
    public static void main (String[] args) {
        HashMap<String, Integer> animals = new HashMap<>();
        animals.put("Tiger", 8);
        animals.put("Elephant", 5);
        animals.put("Squirrel", 1);
        animals.put("Raccoon", 3);
        animals.put("Wolf", 10);
        animals.put("Giraffe", 15);
        animals.put("Monkey", 5);
        animals.put("Donkey", 2);
        animals.put("Horse", 8);
        animals.put("Bear", 20);
        animals.put("Leo", 4);

        Stream<Map.Entry<String, Integer>> animalsStream = animals.entrySet().stream();
        long count = animalsStream.filter(i -> i.getValue() > 4).count();
        System.out.println("Количество животных, которым больше 4 лет: " + count);
    }
}
