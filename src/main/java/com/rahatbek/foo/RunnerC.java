package com.rahatbek.foo;

public class RunnerC implements Runnable{
    private Foo f;

    public RunnerC(Foo f) {
        this.f = f;
    }
    @Override
    public void run() {
        f.third(this);
    }
}
