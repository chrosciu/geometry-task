import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testDistance() {
        Point point = new Point(2.0, 3.0);
        String expected = String.format("distance() called for %s", point.toString());
        assertEquals(expected, point.distance(new Point(1.0, 5.0)));
    }

}