import lombok.Getter;
import lombok.Setter;

public non-sealed class Triangle extends Polygon {
    private static final int CORNERS = 3;

    @Getter
    @Setter
    private Point point1;
    @Getter
    @Setter
    private Point point2;

    @Getter
    @Setter
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        super(CORNERS);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    @Override
    public String getArea() {
        return String.format("getArea() called for %s.", this.toString());
    }

    public IllegalArgumentException caseWhenGivenSidesAreIncorrect() {
        throw new IllegalArgumentException("Basic triangle condition is violated.");
    }

}
