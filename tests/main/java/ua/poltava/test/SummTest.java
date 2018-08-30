package main.java.ua.poltava.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummTest {

    @Test
    public void summ() {
        Summ su = new Summ(1,4);
        int actual = su.summ();
        int expected = 5;
        assertEquals(actual,expected);
    }
}