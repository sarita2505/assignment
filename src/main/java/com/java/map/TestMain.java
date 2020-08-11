package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestMain {
    public static void main(String[] args) {
        Map<Employee,Double> map=m1();
        System.out.println(map);
        Employee e1=new Employee(1,2000.0,"bb");
       // map.put(e1,e1.getSalary());
       Double sala= map.get(e1);
        System.out.println(sala);

        System.out.println("tree map");
        Map<Employee,Double> map1=m2();
        System.out.println(map1.get(e1));
    }

    public static Map<Employee,Double> m1(){
        Map<Employee,Double> e=new HashMap<>();
        Employee e1=new Employee(1,2000.0,"bb");
        Employee e2=new Employee(2,2000.0,"aa");
        Employee e3=new Employee(3,3000.0,"cc");
        Employee e4=new Employee(4,4000.0,"cc");
        e.put(e1,e1.getSalary());
        e.put(e2,e2.getSalary());
        e.put(e3,e3.getSalary());
        e.put(e4,e4.getSalary());
        return e;
    }

    public static Map<Employee,Double> m2(){
        Employee e1=new Employee(1,2000.0,"bb");
        Employee e2=new Employee(2,2000.0,"aa");
        Employee e3=new Employee(3,3000.0,"cc");
        Map<Employee,Double>map=new TreeMap<Employee,Double>();
        map.put(e1,e1.getSalary());
        map.put(e2,e1.getSalary());
        map.put(e3,e1.getSalary());
        return map;
    }
}
