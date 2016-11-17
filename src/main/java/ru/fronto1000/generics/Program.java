package ru.fronto1000.generics;

public class Program {
    public static void main(String[] args){
        B x = new X(1,3);
        B y = new Y(3,8);
        D z = new Z (4,0);
        Q q = new Q(x,z,y);
        System.out.println(q.calcAll());
    }
}
