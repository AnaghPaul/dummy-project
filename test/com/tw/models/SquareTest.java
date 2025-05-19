package com.tw.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void calculatesArea() {
        assertEquals(4,new Square(2).area(),"area of square with side 2 should be 4");
        assertEquals(0,new Square(0).area(),"area of square with side 0 should be 0");
    }

    @Test
    void calculatesPerimeter() {
        assertEquals(8,new Square(2).perimeter(),"perimeter of square with side 2 should be 8");
        assertEquals(0,new Square(0).perimeter(),"perimeter of square with side 0 should be 0");
    }
}