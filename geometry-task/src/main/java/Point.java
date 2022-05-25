public record Point(double x, double y) {
    String distance(Point p) {
        return String.format("Invoked distance from Point ({}) to point ({})", this.toString(), p.toString());
    }
}
