package com.neuedu.test;

public class HourlyEmployee extends ColaEmployee{
    private int hour;
    private int hourSalary;
    public HourlyEmployee(String name,int hour,int hourSalary,int month){
        super(name,month);
        this.hour=hour;
        this.hourSalary=hourSalary;
    }

    @Override
    public double getSalary(int month) {
        if (hour<=160){
            return hour*hourSalary;
        }else {
            return 160*hourSalary+(hour-160)*hourSalary*1.5;
        }
    }
}
