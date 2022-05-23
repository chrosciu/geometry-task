package geometry;

import geometry.exceptions.NegativeRadiusException;

public record Circle(Point p, double radius) implements Shape {
    public Circle {
        if(radius < 0)
            throw new NegativeRadiusException(radius);
    }

    @Override
    public String getArea() {
        return String.format("getArea() calculate an area of a circle %s, radius = %f", this.p, this.radius);
    }
}
