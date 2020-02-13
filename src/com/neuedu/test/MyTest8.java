package com.neuedu.test;

public class MyTest8 {
    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        t1.start();                         //线程的入口在run方法里
//        MyThread1 t2 = new MyThread1();
//        t2.start();
          MyThread2 t2 = new MyThread2();
          Thread t = new Thread(t2);
          t.start();
    }
    public static void run(){};
    public static void eat(){};
    public static void drink(){};
}
