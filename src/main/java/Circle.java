public record Circle(Point point, double radius) implements Shape {
    public Circle {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius is not allowed");
        }
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this.toString());
    }
}

