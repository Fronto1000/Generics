package ru.fronto1000.generics;

public class Z implements D {
    private int a;
    private int b;

    public Z(int b, int a) {
        this.b = b;
        this.a = a;
    }

    public int calc() {
        return a+b;
    }
}
