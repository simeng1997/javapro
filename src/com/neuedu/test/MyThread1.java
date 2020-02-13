package com.neuedu.test;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<=100;i++){
            try {
                Thread.sleep(500);               //单位-毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"线程输出------" +i);
        }
    }
}
