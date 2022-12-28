package com.rahatbek.foo;


import java.util.concurrent.CountDownLatch;

public class Foo {
    CountDownLatch startSignal;
    CountDownLatch doneSignal;

    public Foo() {
        startSignal = new CountDownLatch(0);
        doneSignal = new CountDownLatch(0);
    }

    public void first(Runnable r) {
        System.out.print("first");
    }
    public void second(Runnable r) {
        System.out.print("second");
    }
    public void third(Runnable r) {
        System.out.print("third");
    }
//    CountDownLatch startSignal;
//    CountDownLatch doneSignal;
//
//    public Foo() {
//        startSignal = new CountDownLatch(0);
//        doneSignal = new CountDownLatch(0);
//    }
//
//    public void first(Runnable r) {
//        for (int i = 0; i < 5; i++)
//            System.out.print("first");
//        startSignal.countDown();
//    }
//
//    public void second(Runnable r) {
//        try {
//            startSignal.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for (int i = 0; i < 5; i++)
//            System.out.print("second");
//        doneSignal.countDown();
//    }
//
//    public void third(Runnable r) {
//        try {
//            startSignal.await();
//            System.out.print("third");
//        } catch (InterruptedException e) {
//        }
//    }
}
