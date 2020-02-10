package com.neuedu.test;

public abstract class Shape {
    //面积属性
    private double area;
    //周长属性
    private double per;
    //颜色属性
    private String color;
    public Shape(){}
    public Shape(String color){
        this.color = color;
    };
    public String getColor(){
        return color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();
}
