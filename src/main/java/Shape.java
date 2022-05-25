public sealed interface Shape permits Circle, Polygon {
    abstract String getArea();

    default String getDiameter() {
        return switch (this) {
            case Circle c -> this.returnMessage("Circle");
            case Section s -> this.returnMessage("Section");
            case Triangle t -> this.returnMessage("Triangle");
            default -> this.returnMessage("some Object");
        };
    }

    private String returnMessage(String str) {
        return String.format("getDiameter() called for instance of %s class ", str);
    }

}