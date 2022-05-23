import lombok.Getter;
import lombok.Setter;

public non-sealed class Section extends Polygon {
    @Getter
    @Setter
    private Point point1;

    @Getter
    @Setter
    private Point point2;

    @Getter
    @Setter
    private int corners;


    public Section(int corners, Point point1, Point point2) {
        super(corners);
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String getArea() {
        return String.format("getArea() returns 0 for Section instance.");
    }
}
