package main.java.ezhidkova.week09;

import java.util.*;

public class ageSort {
    public static void ageSort(HashMap<String, Integer> animals) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(animals.entrySet());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Map.Entry<String, Integer> current = list.get(j);
                Map.Entry<String, Integer> next = list.get(j + 1);
                Map.Entry<String, Integer> temporary;
                if (current.getValue() > next.getValue()) {
                    temporary = current;
                    list.set(j, next);
                    list.set(j + 1, temporary);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String args[]) {
        Map<String, Integer> animals = new LinkedHashMap<>();
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
        ageSort((HashMap<String, Integer>) animals);
    }
}
