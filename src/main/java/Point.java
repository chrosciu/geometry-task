public record Point(double x, double y) {

    public String distance(Point p) {
        return String.format("distance() called for %s and %s.", this, p.toString());
    }
}
