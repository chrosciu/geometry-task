import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
public class SectionTest {

    @BeforeAll
    static void setupMsg() {
        log.info("Set up for {} tests.", Section.class);
    }

    @Test()
    @DisplayName("Section calculate area - positive")
    void shouldCountArea() {
        final var expectedMsg = "getArea() returns 0 for Section instance.";
        var point1 = new Point(-1, 0);
        var point2 = new Point(-99, 2.5);
        var section = new Section(2, point1, point2);

        assertThat(section.getArea()).isEqualTo(expectedMsg);
    }

    @Test()
    @DisplayName("Section corners negative - exception")
    void shouldThrowExceptionWhenCornersNegative() {
        final var expectedMsg = "Corners must be of positive number.";
        var point1 = new Point(-1, 0);
        var point2 = new Point(-99, 2.5);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Section(-1, point1, point2).getArea());

        assertThat(exception.getMessage()).isEqualTo(expectedMsg);
    }

    @AfterAll
    static void afterTestMsg() {
        log.info("Test for {} completed.", Section.class);
    }
}
