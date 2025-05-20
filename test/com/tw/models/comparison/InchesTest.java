package com.tw.models.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchesTest {
    @Test
    void create() {
        assertEquals(Inches.create(12),Inches.create(12));
    }

    @Test
    void toFeet() {
        assertEquals(Feet.create(1),Inches.create(12).toFeet());
    }

    @Test
    void toMM() {
        assertEquals(MilliMetre.create(25.4), Inches.create(1).toMM());
    }
}