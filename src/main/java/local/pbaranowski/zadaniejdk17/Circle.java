package local.pbaranowski.zadaniejdk17;

public record Circle(Point center, double radius) implements Shape, Message {
    public Circle {
        if (radius < 0) {
            throw new NegativeRadiusException(radius);
        }
    }

    @Override
    public String getArea() {
        return formatMessage(String.format("getArea((%f  %f) %f)", center.x(), center.y(), radius));
    }
}
