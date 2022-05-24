public record Circle(Point point, double radius) implements Shape {
    public Circle {
        if (radius < 0 || point == null)
            throw new IllegalArgumentException("Incorrect constructor parameters.");
    }

    @Override
    public String getArea() throws IllegalStateException {
        String resultMsg = "";
        if (this.radius == 0) {
            resultMsg =
                    String.format("getArea() called for %s and radius equal %d .", this.getClass(), 0);
        } else {
            resultMsg = String.format("getArea() called for %s .", this.getClass());
        }
        return resultMsg;
    }
}
