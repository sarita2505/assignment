package com.java.ass1;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {
    List<Employee> list ;

    public Consumer(List<Employee> list) {
        this.list = list;
    }

    public void addData() {
        Employee e1 = new Employee("sita", 2);
        list.add(e1);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            addData();
        }
        System.out.println("consumer :"+list);
    }
}
