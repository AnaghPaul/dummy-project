package com.tw.models.stats;

public class Probability {
    private final double chance;

    private Probability(double chance) {
        this.chance = chance;
    }

    public static Probability init(double chance) {
        if(chance < 0 || chance > 1) {
            throw new RuntimeException("incompatible inputs");
        }

        return  new Probability(chance);
    }

    public Probability complement() {
        return new Probability(1 - chance);
    }

    @Override
    public boolean equals(Object obj) {
        Probability pro = (Probability) obj;
        return this.chance == pro.chance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Probability and(Probability anotherProbability) {
        return new Probability(this.chance * anotherProbability.chance);
    }
}
