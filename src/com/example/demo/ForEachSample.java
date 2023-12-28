package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class ForEachSample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,4,5,6,8,9,3,7,0);
        integerList.forEach((i) -> System.out.println("i = " + i));

        Map<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("Ravi", 44);
        nameAgeMap.put("Kalyan", 42);
        nameAgeMap.put("Sri", 33);
        nameAgeMap.put("Raga", 13);
        nameAgeMap.put("Shyam", 22);

        //print all map key and value pair
        nameAgeMap.forEach((key, v) -> System.out.println("key = " + key + " value = " + v));

        // transform map to with different value
        nameAgeMap.entrySet().forEach((key) -> System.out.println("nameAgeMap = " + key));
        Map<String, Integer> transformedMap = nameAgeMap.entrySet().stream().map(entry -> {
            String key = entry.getKey();
            int age = entry.getValue() *2;
            return new AbstractMap.SimpleEntry<>(key, age);
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("transformedMap = " + transformedMap);

        /**
         * Extract key and values to a list object in following ways
         */

        List<String> keys = new ArrayList<>();
        nameAgeMap.entrySet().stream().forEach((object) -> {
           keys.add(object.getKey());
       });
        System.out.println("keys = " + keys);

        List<String> collect = nameAgeMap.keySet().stream().collect(Collectors.toList());
        System.out.println("collect = " + collect);

        List<Integer> collect1 = nameAgeMap.values().stream().collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
        
        nameAgeMap.entrySet().stream().filter( entry -> entry.getValue() > 14).forEach((entry -> System.out.println("entry.getKey() = " + entry.getKey())));
        Map<String, Integer> collect2 = nameAgeMap.entrySet().stream().filter(entry -> entry.getValue() > 14).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("collect2 = " + collect2);
    }
}
