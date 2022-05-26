public record Circle(Point p, double radius) implements Shape {

    public Circle {
        if (radius <= 0.0) {
            throw new IllegalArgumentException(String.format("Radius must be greater than 0. Received radius = %s", radius));
        }
    }

    @Override
    public String getArea() {
        return String.format("getArea() invoked for %s", this);
    }
}
