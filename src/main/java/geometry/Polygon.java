package geometry;


import java.util.List;

public sealed abstract class Polygon implements Shape permits Section, Triangle {

    private final List<Point> points;

    public Polygon(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String getArea() {
        return "Calculate area";
    }
}
