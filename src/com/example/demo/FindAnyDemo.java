package com.example.demo;

import java.util.*;

public class FindAnyDemo {
    public static void main(String[] args) {
        
        List<Integer> emptyList = Arrays.asList();
        List<Integer> integerList = Arrays.asList(3, 5, 6, 7,9,10);

        System.out.println(" findany= " + integerList.stream().findAny().get());
        System.out.println(" findany= " + integerList.stream().findFirst().get());


        //Alternatively you can pass supplier instance in line 22
        // Supplier <Exception> supplier = () -> new Exception("List is empty");

        Integer integer = null;
        try {
            integer = emptyList.stream().findAny().orElseThrow( () -> new Exception ("list is Empty"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("integer = " + integer);
    }
}
