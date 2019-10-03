package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {

    @Test
    void givenOneNumberAsInput_WhenCheks_ThenItShouldBeHappyNumber() {
        HappyNumber one = new HappyNumber();
        assertTrue(one.checkNumber(1));
    }

}

