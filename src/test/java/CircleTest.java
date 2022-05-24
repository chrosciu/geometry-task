import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {
    Point p = new Point(2.0, 3.0);

    @Test
    void testGetArea() {

        Circle circle = new Circle(p, 4.0);
        String expected = String.format("getArea() called for %s", circle.toString());
        assertEquals(expected, circle.getArea());
    }

    @Test
    void whenNegativeRadius_thenThrow(){
        assertThrows(IllegalArgumentException.class,()-> new Circle(p, -2.0));
    }

    @Test
    void testGetDiameter(){
        Circle circle = new Circle(p, 4.0);
        String expected = String.format("getDiameter() called for %s", circle.toString());
        assertEquals(expected, circle.getDiameter());
    }
}