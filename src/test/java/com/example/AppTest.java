package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGetGreeting() {
        String result = App.getGreeting();
        assertEquals("Hello from Maven project!", result);
    }
}
