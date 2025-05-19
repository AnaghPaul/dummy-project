package com.tw.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void calculatesArea() {
        Square square = new Square(2);
        assertEquals(4,square.area(),"area of square with side 2 should be 4");
    }

    @Test
    void calculatesPerimeter() {
        Square square = new Square(2);
        assertEquals(8,square.perimeter(),"perimeter of square with side 2 should be 8");
    }
}