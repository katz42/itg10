package main.java.ezhidkova.week09;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class allAnimals {
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
        Optional<String> optionalResult = animalsList.map(Map.Entry::getKey).reduce((i, j) -> i + " " + j);
        if (optionalResult.isPresent()) {
            String result = optionalResult.get();
            System.out.println(result);
        } else {
            System.out.println("Result is null");
        }
    }
}
