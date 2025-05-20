package com.tw.models.stats;

import com.tw.models.errors.InvalidInputException;

public class Probability {
    private final double chance;

    private Probability(double chance) {
        this.chance = chance;
    }

    public static Probability init(double chance) {
        if(chance < 0 || chance > 1) {
//            throw new InvalidInputException();
        }

        return  new Probability(chance);
    }

    public Probability not() {
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

    public Probability and(Probability another) {
        return new Probability(this.chance * another.chance);
    }

    public Probability or(Probability another) {
        return not().and(another.not()).not();
    }
}
