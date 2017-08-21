package demo;

/**
 * Created by yteng on 8/21/17.
 */
public class A {
    private final B b;

    public A(B b) {
        this.b = b;
    }

    public int methodA(int p) {
        b.anotherMethodB(p);
        return p * b.methodB(p);
    }
}
