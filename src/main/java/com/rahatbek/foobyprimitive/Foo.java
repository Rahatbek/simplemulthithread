package com.rahatbek.foobyprimitive;


public class Foo {
    private boolean doneFirst = false;
    private boolean doneSecond = false;

    public void first(Runnable r) {
        synchronized (this) {
            System.out.print("first");
            this.doneFirst = true;
            notifyAll();
        }
    }

    public void second(Runnable r) {
        synchronized (this) {
            while (!doneFirst) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            System.out.print("second");
            doneFirst = false;
            doneSecond = true;
            notify();
        }
    }

    public void third(Runnable r) {
        synchronized (this) {
            while (!doneSecond) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            System.out.print("third ");
            doneSecond = false;
        }
    }
}
