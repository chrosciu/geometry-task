public sealed abstract class Polygon implements Shape permits Section, Triangle {
    @Override
    public String getArea() {
        return String.format("getArea() invoked for %s", this);
    }
}
