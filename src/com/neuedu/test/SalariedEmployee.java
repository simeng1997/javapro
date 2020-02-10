package com.neuedu.test;

public class SalariedEmployee extends ColaEmployee{
    private int salary;
    public SalariedEmployee(String name,int salary,int month){
        super(name,month);
    }
    @Override
    public double getSalary(int month) {
        return salary;
    }
}
