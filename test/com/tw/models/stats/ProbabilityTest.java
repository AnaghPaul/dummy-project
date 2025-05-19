package com.tw.models.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void init() {
        assertEquals(Probability.init(0.2), Probability.init(0.2));
        assertThrows(Exception.class, ()->Probability.init(-1),"Probability should throw exception when chance is negative ");
        assertThrows(Exception.class, ()->Probability.init(2),"Probability should throw exception when chance is greater than one");
    }

    @Test
    void complement() {
        Probability probability = Probability.init(0.5);
        assertEquals(Probability.init(0.5), probability.complement());
    }

    @Test
    void and() {
        Probability p1 = Probability.init(0.5);
        Probability p2 = Probability.init(0.5);
        assertEquals(Probability.init(0.25),p1.and(p2));
    }
}