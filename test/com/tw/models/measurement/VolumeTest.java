package com.tw.models.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void fromLitre() {
        assertEquals(Volume.fromLitre(10),Volume.fromLitre(10));
    }

    @Test
    void fromGallon() {
        assertEquals(Volume.fromGallon(10),Volume.fromGallon(10));
    }

    @Test
    void gallonAndLitre() {
        assertEquals(Volume.fromGallon(1),Volume.fromLitre(3.78));
    }

    @Test
    void createWithConversionFactor() {
        assertEquals(Volume.create(10,3780),Volume.create(10,3780));
    }

    @Test
    void createWithoutConversionFactor() {
        assertEquals(Volume.create(3780),Volume.create(3780));
    }

    @Test
    void withAndWithoutConversionFactor() {
        assertEquals(Volume.create(10),Volume.create(1,10));
    }
}