import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Getter
@Setter
public non-sealed class Section extends Polygon{
    private Point p1;
    private Point p2;

    public Section(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this.toString());
    }
}
