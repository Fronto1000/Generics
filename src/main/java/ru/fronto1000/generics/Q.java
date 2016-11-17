package ru.fronto1000.generics;

public class Q <X extends B,Y extends B,Z extends D>  {
    private X x;
    private Y y;
    private Z z;

    public Q(X x, Z z, Y y) {
        this.x = x;
        this.z = z;
        this.y = y;
    }

    public int calcAll(){
        return this.x.calc2()+this.y.calc2()+this.z.calc();
    }
}
