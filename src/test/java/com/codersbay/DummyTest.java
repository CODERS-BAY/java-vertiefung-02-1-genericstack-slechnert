package com.codersbay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @Test
    @DisplayName("Assert that the answer to everything is 42")
    public void testTheAnswerToEverything() {
        int answerToEverrrrything = 42;
        assertEquals(answerToEverrrrything, 42);
    }

}
