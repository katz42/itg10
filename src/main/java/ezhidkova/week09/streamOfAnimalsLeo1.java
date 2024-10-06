package main.java.ezhidkova.week09;

import java.util.stream.Stream;

public class streamOfAnimalsLeo1 {
    public static void main (String[] args){
        Stream<String> animals = Stream.of("Tiger", "Elephant", "Squirrel", "Raccoon", "Wolf", "Giraffe", "Monkey", "Donkey", "Horse", "Bear");
        String isLeoPresent = String.valueOf(animals.anyMatch(i -> i.equals("Leo")));
        System.out.println(isLeoPresent);
    }
}