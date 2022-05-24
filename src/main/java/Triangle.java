import java.util.Arrays;

public non-sealed class Triangle extends Polygon {

    public Triangle(Point one, Point two, Point three) {
        super(Arrays.asList(one, two, three));
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s.", this.toString());
    }

    public IllegalArgumentException caseWhenGivenSidesAreIncorrect() {
        throw new IllegalArgumentException("Basic triangle condition is violated.");
    }

}
