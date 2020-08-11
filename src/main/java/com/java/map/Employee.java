package com.java.map;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private  Integer id;
    private Double salary;
    private  String name;

    public Employee() {
    }

    public Employee(Integer id, Double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        System.out.println("hash");
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Employee o) {
        System.out.println("compare to");
        return this.id.compareTo(o.id);
    }
}
