package demo;

/**
 * Created by yteng on 8/21/17.
 */
public class B {

    public int methodB(int p) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return p * p;
    }

    public void anotherMethodB(int p) {
        System.out.println(p);

    }
}
