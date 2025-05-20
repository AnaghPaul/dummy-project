package com.tw.models.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    @Test
    void fromInches() {
        assertEquals(Measurement.fromInches(10), Measurement.fromInches(10));
    }

    @Test
    void fromFeet() {
        assertEquals(Measurement.fromFeet(10), Measurement.fromFeet(10));
    }

    @Test
    void fromCentimeter() {
        assertEquals(Measurement.fromCentimeter(10), Measurement.fromCentimeter(10));
    }

    @Test
    void fromMilliMeter() {
        assertEquals(Measurement.fromMM(10), Measurement.fromMM(10));
    }


    @Test
    void add() {
        Measurement measurement1 = Measurement.fromInches(2);
        Measurement measurement2 = Measurement.fromInches(2);
        Measurement sumOfLengths = Measurement.fromInches(4);

        assertEquals(measurement2.add(measurement1), sumOfLengths);
    }

    @Test
    void addCMAndMM() {
        Measurement cm = Measurement.fromCentimeter(10);
        Measurement mm = Measurement.fromMM(154);
        System.out.println(cm);
        System.out.println(mm);


        Measurement sumInInches = Measurement.fromInches(1);
        System.out.println(sumInInches);
        System.out.println(cm.add(mm));
//        assertEquals(cm.add(mm), sumInInches);
    }

    @Test
    void addCMAndInches() {
        Measurement inches = Measurement.fromInches(1);
        Measurement cm = Measurement.fromCentimeter(2.54);

        assertEquals(inches.add(cm), Measurement.fromInches(2));
    }
}