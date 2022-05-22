package local.pbaranowski.zadaniejdk17;

import java.util.List;

public non-sealed class Triangle extends Polygon {
    public Triangle(Point p1, Point p2, Point p3) {
        super(List.of(p1, p2, p3));
    }
}
