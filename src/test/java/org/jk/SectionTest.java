package org.jk;

import org.junit.Test;


public class SectionTest {

    final Point point = new Point(0d, 0d);
    final Section section = new Section(point, point);


    @Test
    public void testSectionArea() {

        // given
        final String expectedArea = "Area of Section is unknown";

        // when
        final String sectionArea = section.getArea();

        assert (sectionArea).equals(expectedArea);
    }


    @Test
    public void testSectionDiameter() {

        // given
        final String expectedDiameter = "Diameter of object Section";

        // when
        final String sectionDiameter = section.getDiameter();

        // then
        assert (sectionDiameter).equals(expectedDiameter);
    }


}