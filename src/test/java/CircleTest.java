import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
public class CircleTest {
    final static double radius = Math.ceil(Math.random() * 50);
    final static Point point = new Point(3.0, 6.4);

    @Test
    @DisplayName("Calculate Circle area - positive")
    void shouldCalculateAraForPositiveRadius() {

        final String expectedMsg = "getArea() called for";

        assertThat(new Circle(point, radius).getArea())
                .contains(expectedMsg);
    }

    @Test
    @DisplayName("Circle point is null - thrown exception")
    void shouldThrowIllegalStateExceptionWhenPointIsNull() {

        final String expectedMsg = "Incorrect constructor parameters.";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    new Circle(null, radius);
                });
        assertThat(exception.getMessage())
                .isEqualTo(expectedMsg);
    }

    @Test
    @DisplayName("Circle radius 0")
    void shouldReturnMsgForRadiusEqualZero() {
        final String expectedMsg = "radius equal 0";
        assertThat(new Circle(point, 0).getArea())
                .contains(expectedMsg);
    }
}
