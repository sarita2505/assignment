package com.java.ass1;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Employee>list=new ArrayList<>();
        Producer producer=new Producer(list);
        Consumer consumer=new Consumer(list);
        Thread t1=new Thread(producer,"t1");
        Thread t2=new Thread(consumer,"t2");
        t1.start();
        t2.start();
        //System.out.println(list);
    }
}
