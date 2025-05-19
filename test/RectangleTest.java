import models.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test

    void area() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2,rectangle.area(),"area of rectangle should be 2 for dimensions 1 X 2");
    }
}