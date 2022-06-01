package org.jk;

import org.junit.Test;


public class TriangleTest {

    final Point point = new Point(0, 0);
    final Triangle triangle = new Triangle(point, point, point);


    @Test
    public void testTriangleArea() {

        // given
        final String expectedArea = "Area of Triangle is unknown";

        // when
        final String triangleArea = triangle.getArea();

        assert (triangleArea).equals(expectedArea);
    }


    @Test
    public void testTriangleDiameter() {

        // given
        final String expectedDiameter = "Diameter of triangle";

        // when
        final String triangleDiameter = triangle.getDiameter();

        // then
        assert (triangleDiameter).equals(expectedDiameter);
    }


}