package com.tw.models.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimetreTest {
    @Test
    void create() {
        assertEquals(Centimetre.create(12),Centimetre.create(12));
    }

    @Test
    void toMM() {
        assertEquals(MilliMetre.create(10),Centimetre.create(1).toMM());
    }
}