package com.java.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeMain {
    public static void main(String[] args) {
        List list=new ArrayList();
        Employee e1=new Employee(1,2000.0,"bb");
        Employee e2=new Employee(2,2000.0,"aa");
        Employee e3=new Employee(3,3000.0,"cc");
        Employee e4=new Employee(4,4000.0,"cc");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        Comparator<Employee> c=(c1,c2)->{return c1.getName().compareTo(c2.getName());};
        Comparator<Employee> c0=(c3,c4)->{return c4.getSalary().compareTo(c3.getSalary());};
       Comparator<Employee> com= Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary);
               //c.thenComparing(c0);
       list.sort(com);
        System.out.println(list);
    }
}
