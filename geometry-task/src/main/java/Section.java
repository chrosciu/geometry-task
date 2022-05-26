public non-sealed class Section extends Polygon {

    final Point a;
    final Point b;

    public Section(Point a, Point b) {
        System.out.printf(String.format("Creating section object %s", this));

        this.a = a;
        this.b = b;
    }

    public String toString() {
        return String.format("Section(a = %s, b = %s)", a, b);
    }

    public Point getA() { return a; }
    public Point getB() { return b; }
}
