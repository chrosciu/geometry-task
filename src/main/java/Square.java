import lombok.Getter;
import lombok.Setter;

public class Square /* extends Polygon implements Shape */ {
    @Getter
    @Setter
    private double side;

    public Square(double side) {
        if(side < 0){
            throw new IllegalArgumentException("Side cannot be negative.");
        }
        this.side = side;
    }

    public double countSquareArea() {
        return side * side;
    }
}
