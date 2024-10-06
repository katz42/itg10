package main.java.ezhidkova.week09;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class animalsList {
    public static void main (String[] args) {
        HashMap<String, String> animals = new HashMap<>();
        animals.put("Tiger", "Leo");
        animals.put("Elephant", "Dumbo");
        animals.put("Squirrel", "Betty");
        animals.put("Raccoon", "Rocket");
        animals.put("Wolf", "Harry");
        animals.put("Giraffe", "Melman");
        animals.put("Monkey", "Jackie");
        animals.put("Donkey", "Timothy");
        animals.put("Horse", "Gordon");
        animals.put("Bear", "John");
        animals.put("Leo", "Dana");

        Stream<Map.Entry<String, String>> animalsList = animals.entrySet().stream();
        animalsList.forEach(i -> System.out.println(i.getValue() + " the " + i.getKey()));
    }
}
