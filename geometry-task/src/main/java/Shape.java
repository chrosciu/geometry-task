public sealed interface Shape permits Circle, Polygon {
    public String getArea();

    default public String getDiameter() {
        String retVal = "getDiameter invoked for class: ";

        switch (this.getClass().toString()) {
            case "Circle" -> retVal += "Circle";
            case "Section" -> retVal += "Section";
            case "Triangle" -> retVal += "Triangle";
        }

        return retVal;
    }
}
