public record Point(double x, double y) {
    String distance(Point p) {
        return String.format("distance() called for %s", this.toString());
    }
}
