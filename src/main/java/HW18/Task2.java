package HW18;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        data.put(1, "Zhan");
        data.put(2, "Ivan");
        data.put(3, "Alex");
        data.put(4, "Mikhail");
        data.put(5, "Natasha");
        data.put(6, "Ruslan");
        data.put(7, "Marta");
        data.put(8, "Anna");
        data.put(9, "Anastasiya");
        data.put(10, "Victor");
        data.put(11, "Tamara");
        data.put(12, "Gleb");
        data.put(13, "Killian");
        data.put(14, "Stepan");
        Set<Integer> allowedId = Set.of(1, 2, 5, 8, 9, 13);
        List<String> result = data.entrySet().stream()
                .filter(n -> allowedId.contains(n.getKey()))
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 != 0)
                .map(name -> new StringBuilder(name).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
