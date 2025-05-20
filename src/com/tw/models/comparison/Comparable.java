package com.tw.models.comparison;

public class Comparable {

    private final MilliMetre mm;

    public Comparable(MilliMetre mm) {
        this.mm = mm;
    }

    public static Comparable create(Units length) {
        return  new Comparable(length.toMM());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return mm.equals(((Comparable) obj).mm);
    }
}
