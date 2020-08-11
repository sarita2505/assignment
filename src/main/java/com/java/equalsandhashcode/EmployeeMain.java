package com.java.equalsandhashcode;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
    public static void main(String[] args) {
        Map<Employee,String> map=new HashMap<>();
        Employee e1=new Employee(1,"hari");
        Employee e5=new Employee(1,"hari");
        Employee e2=new Employee(2,"hari");
        Employee e3=new Employee(1,"raghu");
        e1=new Employee(4,"radhe");
        map.put(e1,"1stobj");
        map.put(e2,"2ndobj");
        map.put(e3,"3rdobj");
        map.put(e1,"duplicate");
        map.put(e5,"5th obj");
        System.out.println(map.size());
        System.out.println(map.get(e1));
        System.out.println(map.get(e1).equals(map.get(e1)));
    }
}
