package com.example;

import org.junit.Test;

public class BowlingTest {
    @Test
    public void canCreateGame() throws Exception {
        Game g = new Game();
    }

    @Test
    public void canRoll() {
        Game g = new Game();
        g.roll(0);
    }
}