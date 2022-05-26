import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {
    private static final Point POINT = new Point(99.1, 109.2);
    private static final double RADIUS = 19.3;

    @Test
    public void shouldCreateCircle() {
        Circle circle = new Circle(POINT, RADIUS);

        Assertions.assertEquals(POINT, circle.p());
        Assertions.assertEquals(RADIUS, circle.radius());
    }

    @Test
    public void shouldThrowWhenNegativeRadius() {
        final double negativeRadius = -13.7;

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Circle(POINT, negativeRadius));

        Assertions.assertEquals("Radius must be greater than 0. Received radius = -13.7", exception.getMessage());
    }

    @Test
    public void shouldCalculateArea() {
        Circle circle = new Circle(POINT, RADIUS);

        String area = circle.getArea();

        Assertions.assertEquals("getArea() invoked for Circle[p=Point[x=99.1, y=109.2], radius=19.3]", area);
    }

    @Test
    public void shouldCalculateDiameter() {
        Circle circle = new Circle(POINT, RADIUS);

        String diameter = circle.getDiameter();

        Assertions.assertEquals("getDiameter() invoked for class Circle", diameter);
    }
}
