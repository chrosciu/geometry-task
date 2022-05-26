
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    private static final double X = 99.1;
    private static final double Y = 109.2;

    @Test
    void shouldCreatePoint() {
        Point p = new Point(X, Y);

        Assertions.assertEquals(X, p.x());
        Assertions.assertEquals(Y, p.y());
    }

    @Test
    void shouldCalculateDistance() {
        final double X_TO = 11.1;
        final double Y_TO = 12.1;

        Point from = new Point(X, Y);
        Point to = new Point(X_TO, Y_TO);

        String distance = from.distance(to);

        Assertions.assertEquals("Invoked distance from Point[x=99.1, y=109.2] to Point[x=11.1, y=12.1]", distance);
    }
}
