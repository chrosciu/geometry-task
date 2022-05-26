public non-sealed class Triangle extends Polygon {
    final Point a;
    final Point b;
    final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return String.format("Triangle(a = %s, b = %s, c = %s)", a, b, c);
    }

    public Point getA() { return a; }
    public Point getB() { return b; }
    public Point getC() { return c; }
}
