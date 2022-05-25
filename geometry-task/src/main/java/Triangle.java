
public non-sealed class Triangle extends Polygon {
    final Point a;
    final Point b;
    final Point c;

    public Triangle(Point a, Point b, Point c) {
        System.out.printf("Creating triangle object");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    Point getA() { return a; }
    Point getB() { return b; }
    Point getC() { return c; }
}
