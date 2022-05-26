import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SectionTest {

    private static final Point A = new Point(99.1, 109.2);
    private static final Point B = new Point(119.1, 129.2);

    @Test
    public void shouldCreateSection() {
        Section section = new Section(A, B);

        Assertions.assertEquals(A, section.getA());
        Assertions.assertEquals(B, section.getB());
    }

    @Test
    public void shouldCalculateArea() {
        Section section = new Section(A, B);

        String area = section.getArea();

        Assertions.assertEquals("getArea() invoked for Section(a = Point[x=99.1, y=109.2], b = Point[x=119.1, y=129.2])", area);
    }

    @Test
    public void shouldCalculateDiameter() {
        Section section = new Section(A, B);

        String diameter = section.getDiameter();

        Assertions.assertEquals("getDiameter() invoked for class Section", diameter);
    }

}
