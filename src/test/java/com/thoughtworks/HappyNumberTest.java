package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {

    @Test
    void givenOneNumberAsInput_WhenCheks_ThenItShouldBeHappyNumber() {
        HappyNumber one = new HappyNumber();
        assertTrue(one.checkNumber(1));
    }

    @Test
    void givenThreeNumberAsInput_WhenCheks_ThenItShouldBeHappyNumber() {
        HappyNumber three = new HappyNumber();
        assertFalse(three.checkNumber(3));
    }

    @Test
    void givenNineNumberAsInput_WhenCheks_ThenItShouldBeHappyNumber() {
        HappyNumber nine = new HappyNumber();
        assertFalse(nine.checkNumber(9));
    }
}

