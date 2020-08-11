package com.java.ass3;

import com.java.ass1.Employee;

public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = (Address) new Student().clone();
        //System.out.println(address);
        Student s1 = new Student("ram", address);
        Address s2 = (Address) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        s1 = new Student("ram", new Address("s2","c2"));
        System.out.println("after making changes in s1"+s1);
        System.out.println("after making changes in s1 s2 is"+s2);

    }

}
