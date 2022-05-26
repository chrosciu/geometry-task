public sealed interface Shape permits Circle, Polygon {
    String getArea();

    default String getDiameter() {
        String msg = "getDiameter() invoked for class ";

        switch (this) {
            case Circle c -> msg += c;
            case Section s -> msg += s;
            case Triangle t -> msg += t;
        }

        return msg;
    }
}
