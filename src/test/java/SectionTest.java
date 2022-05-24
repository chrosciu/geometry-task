import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectionTest {

    @Test
    void testGetArea(){
        Section section = new Section(new Point(2.0, 3.0), new Point(4.0, 3.0));
        String expected = String.format("getArea() called for %s", section.toString());
        assertEquals(expected, section.getArea());
    }
    @Test
    void testGetDiameter(){
        Section section = new Section(new Point(2.0, 3.0), new Point(4.0, 3.0));
        String expected = String.format("getDiameter() called for %s", section.toString());
        assertEquals(expected, section.getDiameter());
    }
}