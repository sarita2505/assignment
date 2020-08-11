package com.java.ass2;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        Student s1=new Student("name1",1);
        Student s2=new Student("name2",2);
        Student s3=new Student("name3",3);
        map.put(s1,"std1");
        map.put(s2,"std2");
        map.put(s3,"std3");
        System.out.println(map.size());
        //System.out.println(map.hashCode());
    }
}
