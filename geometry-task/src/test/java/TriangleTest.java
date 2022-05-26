import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    private static final Point A = new Point(99.1, 109.2);
    private static final Point B = new Point(119.1, 129.2);
    private static final Point C = new Point(139.1, 149.2);

    @Test
    public void shouldCreateTriangle() {
        Triangle triangle = new Triangle(A, B, C);

        Assertions.assertEquals(A, triangle.getA());
        Assertions.assertEquals(B, triangle.getB());
        Assertions.assertEquals(C, triangle.getC());
    }

    @Test
    public void shouldCalculateArea() {
        Triangle triangle = new Triangle(A, B, C);

        String area = triangle.getArea();

        Assertions.assertEquals("getArea() invoked for Triangle(a = Point[x=99.1, y=109.2], b = Point[x=119.1, y=129.2], c = Point[x=139.1, y=149.2])", area);
    }

    @Test
    public void shouldCalculateDiameter() {
        Triangle triangle = new Triangle(A, B, C);

        String diameter = triangle.getDiameter();

        Assertions.assertEquals("getDiameter() invoked for class Triangle", diameter);
    }
}
