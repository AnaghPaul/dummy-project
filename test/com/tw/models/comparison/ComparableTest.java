package com.tw.models.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparableTest {
    @Test
    void create() {
        assertEquals(Comparable.create(Inches.create(1)), Comparable.create(Inches.create(1)));
    }



}