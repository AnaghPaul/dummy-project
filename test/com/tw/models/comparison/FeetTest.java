package com.tw.models.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void create() {
        assertEquals(Feet.create(12),Feet.create(12));
    }

    @Test
    void toInches() {
        assertEquals(Inches.create(12), Feet.create(1).toInches());
    }

    @Test
    void toMM() {
        assertEquals(MilliMetre.create(304.8), Feet.create(1).toMM());
    }
}