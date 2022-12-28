package com.rahatbek.foobysemaphore;

import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore runSecond;
    private Semaphore runThird;

    public Foo() {
        runSecond = new Semaphore(0);
        runThird = new Semaphore(0);
    }

    public void first(Runnable r) {
        System.out.print("first");
        runSecond.release();
    }

    public void second(Runnable r) {
        try {
            runSecond.acquire();
            System.out.print("second");
            runThird.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void third(Runnable r) {
        try {
            runThird.acquire();
            System.out.print("third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
