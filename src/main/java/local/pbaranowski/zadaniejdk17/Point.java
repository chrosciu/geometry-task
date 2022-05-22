package local.pbaranowski.zadaniejdk17;

public record Point(double x, double y) implements Message {
    public String distance(Point p) {
        if (p == null)
            return formatMessage("distance -> Point is null");
        return formatMessage(String.format("distance (%f  %f) <-> (%f  %f)", this.x, this.y, p.x(), p.y()));
    }
}
