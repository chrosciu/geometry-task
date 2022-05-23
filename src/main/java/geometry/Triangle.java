package geometry;

import java.util.Arrays;

public non-sealed class Triangle extends Polygon {

    public Triangle(Point first, Point second, Point third) {
        super(Arrays.asList(first, second, third));
    }
}
