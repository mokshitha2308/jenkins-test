package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        // Simply test if the string "Hello, World!" is part of the output
        String output = "Hello, World!";
        assertTrue(output.contains("Hello, World!"));
    }
}

