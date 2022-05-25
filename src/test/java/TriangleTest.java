import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
public class TriangleTest {

    @Test
    @DisplayName("Polygon creation - positive path")
    void shouldCreatePolygonInstance() {
        var point1 = new Point(2, 2);
        var point3 = new Point(1, 1);
        var point2 = new Point(3, 3);

        assertThat(new Triangle(point1, point2, point3))
                .isInstanceOf(Polygon.class);
    }

    @Test
    @DisplayName("Basic triangle condition violated")
    void shouldThrowExceptionWhenTriangleConditionNotFulfilled() {
        final var expectedMsg = "Basic triangle condition is violated.";
        var point1 = new Point(2, 2);
        var point3 = new Point(1, 1);
        var point2 = new Point(3, 3);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Triangle(point1, point2, point3)
                        .caseWhenGivenSidesAreIncorrect());

        assertThat(exception.getMessage()).isEqualTo(expectedMsg);
    }
}
