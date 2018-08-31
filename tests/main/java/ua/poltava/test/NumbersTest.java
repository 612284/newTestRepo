package main.java.ua.poltava.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void square() {
        Numbers numbers = new Numbers(3,2);
        double actual = numbers.square();
        double expected = 9;

        assertEquals( expected, actual, 0 );
    }
}