package com.java.ass5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctNo {
    public static void main(String[] args) {
        Integer[] a=new Integer[]{1,1,2,2,2,3,4,4,5};
        Set<Integer> set=new HashSet<>();
        for (Integer a1:a) {
            set.add(a1);
        }
       Object[] a2=set.toArray();
        //a=(Integer[]) a2;
        System.out.println(Arrays.toString(a2));
    }
}
