import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Getter
@Setter
public non-sealed class Triangle extends Polygon{
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this.toString());
    }
}
