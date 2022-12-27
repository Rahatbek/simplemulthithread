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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("second");
        runThird.release();
    }

    public void third(Runnable r) {
        try {
            runThird.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("third");
    }


}
