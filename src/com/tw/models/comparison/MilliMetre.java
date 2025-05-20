package com.tw.models.comparison;

public class MilliMetre implements  Units{
    private final double length;

    private MilliMetre(double length) {
        this.length = length;
    }

    public static MilliMetre create(double length) {
        return  new MilliMetre(length);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return  length == ((MilliMetre) obj).length;
    }

    @Override
    public MilliMetre toMM() {
        return this;
    }
}
