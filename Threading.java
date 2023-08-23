package com.practice.javaprograms;

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Welcome");
            i++;
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
