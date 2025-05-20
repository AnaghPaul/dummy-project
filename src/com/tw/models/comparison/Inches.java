package com.tw.models.comparison;

public class Inches implements  Units{
    private final double length;

    public Inches(double length) {
        this.length = length;
    }

    public static Inches create(double length) {
        return  new Inches(length);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Inches anotherLength = (Inches) obj;
        return  length == anotherLength.length;
    }

    public Feet toFeet() {
        return  Feet.create(length / 12);
    }

    public MilliMetre toMM() {
        return MilliMetre.create(length * 25.4);
    }
}
