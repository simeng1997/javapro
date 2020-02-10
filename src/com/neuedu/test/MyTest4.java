package com.neuedu.test;

public class MyTest4 {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(2,3,"红色");
//        rectangle.showAll();
//        Circle circle = new Circle(2,"红色");
//        circle.showAll();
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三",10000,1);
        System.out.println(salariedEmployee.getSalary(2));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("李四",200,30,2);
        System.out.println(hourlyEmployee.getSalary(2));
        SalesEmployee salesEmployee = new SalesEmployee("王五",100000,0.06,2);
        System.out.println(salariedEmployee.getSalary(2));
    }
}
