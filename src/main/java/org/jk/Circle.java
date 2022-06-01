package org.jk;


record Circle(Point point, Double radius) implements Shape {

    Circle(Point point, Double radius) {
        this.point = point;
        this.radius = radius;

        if (radius < 0) {
            throw new IllegalArgumentException("Radius can not be negative ");
        }
    }

    @Override
    public String getArea() {

        final Double area = Math.PI * Math.pow(radius, 2) / 2;

        return String.format("Circle area %1$,.2f", area);
    }

}
