package com.java.ass1;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
     private List<Employee> list;

    public Producer(List<Employee> list) {
        this.list = list;
    }

    public  void addData(){
     Employee e1=new Employee("hari",1);
      list.add(e1);
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            addData();
        }
        System.out.println("producer :"+list);
    }
}
