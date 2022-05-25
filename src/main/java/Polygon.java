import java.util.List;

public abstract sealed class Polygon implements Shape permits Section, Triangle {
    private List<Point> corners;

    public Polygon(List<Point> corners) {
        if (corners.size() <= 0)
            throw new IllegalArgumentException("Polygon must have corners.");
        this.corners = corners;
    }
}
