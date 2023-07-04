package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void main() {
        String a = "Tot";

        assertEquals("Tot", a);
        String b = "Tot";
        assertEquals("Tot", b);


    }
}