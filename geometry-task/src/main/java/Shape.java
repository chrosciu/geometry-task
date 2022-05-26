public sealed interface Shape permits Circle, Polygon {
    String getArea();

    default String getDiameter() {
        String retVal = "getDiameter() invoked for class ";

        switch (this.getClass().getSimpleName()) {
            case "Circle" -> retVal += "Circle";
            case "Section" -> retVal += "Section";
            case "Triangle" -> retVal += "Triangle";
        }

        return retVal;
    }
}
