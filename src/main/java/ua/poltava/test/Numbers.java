package main.java.ua.poltava.test;

public class Numbers {
    private double a;
    private double b;

    public Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double square() {

        return Math.pow(a, b);
    }
}
