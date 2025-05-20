package com.tw.models.measurement;

public class Measurement {
    public static final double FEET_TO_INCHES = 12;
    public static final double CM_TO_INCHES = 1/2.54;
    public static final double MM_TO_INCHES = 1/25.4;
    public static final int L_TO_ML = 1000;
    public static final int GALLON_TO_ML = 3780;
    public static final double Gallon_To_Litre = 3.78541;
    private final double quantity;
    private final Unit unit;

    private Measurement(double quantity, Unit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public static Measurement fromInches(double value) {
        return new Measurement(value , Unit.INCHES);
    }

    public static Measurement fromFeet(double value) {
        return new Measurement(value * FEET_TO_INCHES, Unit.FEET);
    }

    public static Measurement fromCentimeter(double value) {
        return new Measurement(value * CM_TO_INCHES, Unit.CM);
    }

    public static Measurement fromMM(double value) {
        return new Measurement(value * MM_TO_INCHES, Unit.MM);
    }

    public static Measurement create(double value, Unit unit) {
        return new Measurement(value, unit);
    }

    public static Measurement fromLitre(double quantity) {
        return new Measurement(quantity , Unit.LITRE );
    }

    public static Measurement fromGallon(double quantity) {
        return new Measurement(quantity * Gallon_To_Litre, Unit.GALLON);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return quantity == ((Measurement) obj).quantity;
    }

    public Measurement add(Measurement another) {
        return Measurement.create(another.quantity + quantity,Unit.INCHES);
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + "::: type :" + unit;
    }
}
