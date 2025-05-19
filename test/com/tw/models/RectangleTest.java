package com.tw.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test

    void calculatesArea() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2,rectangle.area(),"area of rectangle should be 2 for dimensions 1 X 2");
    }

    @Test
    void calculatesPerimeter() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(6,rectangle.perimeter(),"perimeter of rectangle of dimensions 1 X 2 should be 6");
    }
}