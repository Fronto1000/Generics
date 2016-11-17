package ru.fronto1000.generics;

public class X implements B {
    private int a;
    private int b;

    public X(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calc2() {
        return a+b;
    }
}
