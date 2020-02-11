package com.neuedu.test;

public class Circle extends Shape{
    private double radius;
    public Circle(){}
    public Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*3.14*radius ;
    }

    @Override
    public void showAll() {
        System.out.println("圆面积为：" +getArea());
        System.out.println("圆周长为：" +getPer());
        System.out.println("圆颜色为：" +getColor());
    }


}
