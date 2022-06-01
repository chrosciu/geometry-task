package org.jk;


sealed interface Shape permits Circle, Polygon {

    String getArea();

    default String getDiameter() {

        String objectName = switch (this) {
            case Circle circle -> "circle";
            case Triangle triangle -> "triangle";
            default -> String.format("object %s", this.getClass().getSimpleName());
        };

        return String.format("Diameter of %s", objectName);
    }


}
