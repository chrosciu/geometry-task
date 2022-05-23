package geometry;

public record Point(double x, double y) {
    public String distance(Point p) {
        return String.format("distance(Point p) calculates distance between %s and %s", this, p);
    }
}
