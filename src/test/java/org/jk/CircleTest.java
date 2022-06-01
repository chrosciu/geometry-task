package org.jk;


import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CircleTest {

    final Point point = new Point(0d, 0d);


    @Test
    public void testCircleArea() {

        // given
        final double radius = 10d;
        Circle circle = new Circle(point, radius);
        final String expectedArea = "Circle area 157,08";

        // when
        String circleArea = circle.getArea();

        //than
        assertTrue(circleArea.equals(expectedArea));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testCircleNegativeRadius() {

        // given
        final double radius = -10d;

        // when
        Circle circle = new Circle(point, radius);
    }


    @Test
    public void testCircleDiameter() {

        // given
        final double radius = 1d;

        final Circle circle = new Circle(point, radius);
        final String expectedDiameter = "Diameter of circle";

        // when
        final String circleDiameter = circle.getDiameter();

        // then
        assert (circleDiameter).equals(expectedDiameter);
    }


}
