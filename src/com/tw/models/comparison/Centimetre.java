package com.tw.models.comparison;

public class Centimetre implements Units  {
    private final double length;

    private Centimetre(double length) {
        this.length = length;
    }

    public static Centimetre create(double length) {
        return  new Centimetre(length);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return length == ((Centimetre) obj).length;
    }

    public MilliMetre toMM() {
        return MilliMetre.create(length * 10);
    }
}
