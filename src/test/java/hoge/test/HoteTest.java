package hoge.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class HoteTest {
    @Test public void testMethod1() {
        Hoge hoge = new Hoge();
        assertEquals("hoge2", hoge.method1());
    }
}
