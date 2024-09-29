package week08;

import java.util.*;

public class bubbleSort {

    public static void bubbleSort(HashMap<String, Double> students) {
        List<Map.Entry<String, Double>> list = new ArrayList<>(students.entrySet());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Map.Entry<String, Double> current = list.get(j);
                Map.Entry<String, Double> next = list.get(j + 1);
                Map.Entry<String, Double> temporary;
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
        Map<String, Double> students = new LinkedHashMap<>();
        students.put("Иванов", 4.5);
        students.put("Петров", 3.7);
        students.put("Сидоров", 4.2);
        students.put("Козлов", 5.0);
        students.put("Смирнов", 3.9);
        bubbleSort((HashMap<String, Double>) students);
    }
}