package com.java.ass4;

import com.java.map.Employee;

import java.io.*;

public class SerDeser {
    public static void main(String[] args) {
        Student student = new Student("hari",1);
        try {
            FileOutputStream fos=new FileOutputStream("std");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            System.out.println("serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("std");
            ObjectInputStream objectInputStream = null;
            objectInputStream = new ObjectInputStream(fis);

               student=(Student) objectInputStream.readObject();
            System.out.println(student);
            System.out.println("deserialized");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
