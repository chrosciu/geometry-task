public non-sealed class Section extends Polygon {

    final Point a;
    final Point b;

    public Section(Point a, Point b) {
        System.out.printf(String.format("Creating section object {}", this.toString()));

        this.a = a;
        this.b = b;
    }

    Point getA() { return a; }
    Point getB() { return b; }
}
