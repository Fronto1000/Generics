package ru.fronto1000.generics;

public class Y implements B{
    private int a;
    private int b;

    public Y(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calc2() {
        return a+b;
    }
}
