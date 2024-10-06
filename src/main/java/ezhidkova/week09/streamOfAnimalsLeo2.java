package main.java.ezhidkova.week09;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class streamOfAnimalsLeo2 {
    public static void main (String[] args){
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

        int leoAge = animals.get("Leo");

        Stream<Map.Entry<String, Integer>> animalsStream = animals.entrySet().stream();
        String isLeoPresent = String.valueOf(animalsStream.anyMatch(i -> i.getKey().equals("Leo")));

        if (isLeoPresent.equals(String.valueOf(true))) {
            System.out.println(leoAge);
        } else {
            System.out.println(false);
        }
    }
}