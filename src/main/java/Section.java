import java.util.Arrays;

public non-sealed class Section extends Polygon {

    public Section(Point point1, Point point2) {
        super(Arrays.asList(point1, point2));
    }

    @Override
    public String getArea() {
        return String.format("getArea() returns 0 for Section instance.");
    }
}
