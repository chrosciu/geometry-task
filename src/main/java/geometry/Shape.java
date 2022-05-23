package geometry;

import java.util.List;

public sealed interface Shape permits Circle, Polygon {
    String getArea();

    default String getDiameter() {
        return switch (this) {
            case Section section -> {
                List<Point> points = section.getPoints();
                yield String.format("diameter-section %s %s",
                                                points.get(0),
                                                points.get(1));
            }
            case Circle circle -> String.format("diameter-circle %s  radius = %f",
                                                            circle.p(),
                                                            circle.radius());
            case Triangle triangle ->  {
                List<Point> points = triangle.getPoints();
                yield String.format("diameter-triangle %s %s %s",
                                                    points.get(0),
                                                    points.get(1),
                                                    points.get(2));
            }
        };
    }
}
