public record Circle(Point point, double radius) implements Shape {
    public Circle {
        if (radius < 0)
            throw new IllegalArgumentException("Radius shouldn't be negative.");
    }

    @Override
    public String getArea() throws IllegalStateException {
        String resultMsg = "";
        if (this.point == null)
            throw new IllegalStateException("Point mustn't be null.");
        if (this.radius == 0) {
            resultMsg =
                    String.format("getArea() called for %s and radius equal %d .", this.getClass(), 0);
        } else {
            resultMsg = String.format("getArea() called for %s .", this.getClass());
        }
        return resultMsg;
    }
}
