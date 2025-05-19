package com.tw.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test

    void calculatesArea() {
        assertEquals(2,new Rectangle(1, 2).area(),"area of rectangle should be 2 for dimensions 1 X 2");
        assertEquals(0,new Rectangle(1, 0).area(),"area of rectangle should be 0 for dimensions 1 X 0");
        assertEquals(0,new Rectangle(0, 1).area(),"area of rectangle should be 0 for dimensions 0 X 1");
        assertEquals(0,new Rectangle(0, 0).area(),"area of rectangle should be 0 for dimensions 0 X 0");
    }

    @Test
    void calculatesPerimeter() {
        assertEquals(6,new Rectangle(1, 2).perimeter(),"perimeter of rectangle of dimensions 1 X 2 should be 6");
        assertEquals(2,new Rectangle(1, 0).perimeter(),"perimeter of rectangle of dimensions 1 X 0 should be 2");
        assertEquals(2,new Rectangle(0, 1).perimeter(),"perimeter of rectangle of dimensions 0 X 1 should be 2");
        assertEquals(0,new Rectangle(0, 0).perimeter(),"perimeter of rectangle of dimensions 0 X 0 should be 0");
    }
}