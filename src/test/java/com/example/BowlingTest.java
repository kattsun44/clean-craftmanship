package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingTest {
    private Game g;

    @Before
    public void setUp() {
        g = new Game();
    }

    @Test
    public void gatterGame() throws Exception {
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
        assertEquals(0, g.score());
    }
}