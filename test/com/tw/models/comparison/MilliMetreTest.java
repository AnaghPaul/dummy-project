package com.tw.models.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilliMetreTest {
    @Test
    void create() {
        assertEquals(MilliMetre.create(1000), MilliMetre.create(1000));
    }
}