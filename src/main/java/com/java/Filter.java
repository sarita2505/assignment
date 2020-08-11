package com.java;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Filter {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        Integer i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                l1.add(i);
                map.put(3, l1);
            }
            if (i % 5 == 0) {
                l2.add(i);
                map.put(5, l2);
            }
            if (i % 15 == 0) {
                l3.add(i);
                map.put(15, l3);
            }
        }
        System.out.println(map);


        // Map<Integer, List<Integer>> map;
        Predicate<Integer> p1 = (j) -> {
            if (j % 3 == 0 || j % 5 == 0 || j % 15 == 0) {
                return true;
            }
            return false;
        };
        Function<Integer,Integer> function=(b)->{return b;};
        Map<Integer,List<Integer>> result=  IntStream.
                rangeClosed(0,100).
                boxed().filter(p1).collect(Collectors.groupingBy(function));
        System.out.println(result);

    }
}
