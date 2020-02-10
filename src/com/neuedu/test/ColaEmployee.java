package com.neuedu.test;

public abstract class ColaEmployee {
    private String name;
    private int month;
    public ColaEmployee(String name,int month){
        this.name=name;
        this.month=month;
    }
    public abstract double getSalary(int month);
}
