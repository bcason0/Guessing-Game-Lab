package io.bryantcason;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by bryantcason on 4/28/16.
 */
public class GameSpec {

    @Test
    public void tooBigTest() {
        Game game = new Game();

        game.secretNumber = 50;
        game.currentGuess = 70;
        assertTrue("This should be true", game.tooBig());
    }

    @Test
    public void tooSmallTest() {
        Game game = new Game();

        game.secretNumber = 50;
        game.currentGuess = 100;
        assertFalse("This should be false", game.tooSmall());
    }

    @Test
    public void equalTest() {
        Game game = new Game();

        game.secretNumber = 50;
        game.currentGuess = 100;
        assertTrue("This should be true", game.equals());
    }
}

