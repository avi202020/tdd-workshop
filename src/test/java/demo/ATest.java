package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by yteng on 8/21/17.
 */
public class ATest {

    @Test
    public void test() {
        B b = new B();
        A a = new A(b);
        int result = a.methodA(3);
        assertEquals(27, result);
    }

    @Test
    public void test2() {
        B b = mock(B.class);
        when(b.methodB(3)).thenReturn(12);
        A a = new A(b);
        int result = a.methodA(3);
        assertEquals(36, result);
        verify(b).anotherMethodB(3);
    }


}