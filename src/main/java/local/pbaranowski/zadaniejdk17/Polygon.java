package local.pbaranowski.zadaniejdk17;

import java.util.List;

public sealed abstract class Polygon implements Shape, Message permits Section, Triangle {

    private final List<Point> corners;

    public Polygon(List<Point> corners) {
        this.corners = corners;
    }

    public List<Point> getCorners() {
        return corners;
    }

    @Override
    public String getArea() {
        return formatMessage("getArea()");
    }
}
