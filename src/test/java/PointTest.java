import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
public class PointTest {

    @Test
    @DisplayName("Point: calculate distance - positive")
    void shouldCalculateDistance() {
        final String expectedMsg = "distance() called for Point[x=-1.0, y=0.5] and Point[x=2.0, y=3.0].";
        Point referencePoint = new Point(2.0, 3.0);
        Point point = new Point(-1.0, 0.5);

        assertThat(point.distance(referencePoint))
                .isEqualTo(expectedMsg);
    }

    @Test
    @DisplayName("Point: calculate distance -same coord - positive")
    void shouldCalculateDistanceWhenSameCoordinates() {
        final String expectedMsg =
                "distance() called for Point[x=0.0, y=0.0] and Point[x=0.0, y=0.0].";
        Point referencePoint = new Point(0, 0);
        Point point = new Point(0, 0);

        assertThat(point.distance(referencePoint))
                .isEqualTo(expectedMsg);
    }

    @Test
    @DisplayName("Reference point null - exception - negative")
    void shouldThrowExceptionWhenReferencePointIsNull() {
        final String expectedMsg = "Cannot invoke \"Point.toString()\" because \"p\" is null";
        Point referencePoint = null;
        Point point = new Point(-1.0, 0.5);
        Exception exception = assertThrows(NullPointerException.class,
                () -> point.distance(referencePoint));

        assertThat(exception.getMessage())
                .isEqualTo(expectedMsg);
    }
}
