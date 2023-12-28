package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,4,5,6,8,9,3,7,0);
        integerList.stream().filter(i -> i%2 ==0).forEach( (i) -> System.out.println("i = " + i));
    }
}
