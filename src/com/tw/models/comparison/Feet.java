package com.tw.models.comparison;

public class Feet implements Units {
    private final double length;

    public Feet(double length) {
        this.length = length;
    }

    public static Feet create(double length) {
        return new Feet(length);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Feet anotherLength = (Feet) obj;
        return  length == anotherLength.length;
    }

    public Inches toInches() {
        return  Inches.create(length * 12);
    }

    public MilliMetre toMM() {
        return MilliMetre.create(length * 304.8);
    }
}
