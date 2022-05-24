import lombok.extern.slf4j.Slf4j;

public sealed interface Shape permits Circle, Polygon{
    String getArea();

    default String getDiameter() {
        return switch (this){
            case Circle c -> String.format("getDiameter() called for %s", this.toString());
            case Section c -> String.format("getDiameter() called for %s", this.toString());
            case Triangle c -> String.format("getDiameter() called for %s", this.toString());
        };
    }
}
