package com.example.diceroller

import junit.framework.Assert.assertTrue
import org.junit.Test


class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        assertTrue("The dice must rolled between 1 and 6", diceRoll in 1..6)
    }
}