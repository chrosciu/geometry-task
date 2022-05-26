public record Point(double x, double y) {
    String distance(Point p) {
        return String.format("Invoked distance from %s to %s", this, p);
    }
}
