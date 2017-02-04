package hoge.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HoteTest {
    @Test public void testMethod1() {
        Hoge hoge = new Hoge();
        assertEquals("hoge1+2", hoge.method1());
    }

    @Test public void testLog2() {
    	Hoge hoge = new Hoge();
    	PrintStream orgOut = System.out;
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(baos));
    	try {
    		hoge.log2();
    		assertEquals("log 2" + System.lineSeparator(), baos.toString());
    	} catch (Exception e) {
    	} finally {
    		System.setOut(orgOut);
    	}
    	
    }
}
