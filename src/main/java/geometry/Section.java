package geometry;

import java.util.stream.Stream;

public non-sealed class Section extends Polygon {

    public Section(Point first, Point second) {
        super(Stream.of(first, second).toList());
    }
}