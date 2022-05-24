import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle(new Point(2.0, 3.0), new Point(4.0, 3.0), new Point(1.0, 14.0));

    @Test
    void testGetArea(){
        String expected = String.format("getArea() called for %s", triangle.toString());
        assertEquals(expected, triangle.getArea());
    }
    @Test
    void testGetDiameter(){
        String expected = String.format("getDiameter() called for %s", triangle.toString());
        assertEquals(expected, triangle.getDiameter());
    }
}