package com.tw.models.measurement;

public class Volume {
    public static final int L_TO_ML = 1000;
    public static final int GALLON_TO_ML = 3780;
    private final double ml;

    private Volume(double ml) {
        this.ml = ml;
    }

    public static Volume fromLitre(double quantity) {
        return new Volume(quantity * L_TO_ML);
    }

    public static Volume fromGallon(double quantity) {
        return new Volume(quantity * GALLON_TO_ML);
    }

    public static Volume create(double quantity, double conversionFactor) {
        return new Volume(quantity* conversionFactor);
    }

    public static Volume create(double ml) {
        return new Volume(ml);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return ml == ((Volume) obj).ml;
    }
}
