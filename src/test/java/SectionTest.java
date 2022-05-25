import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SectionTest {

    @Test()
    @DisplayName("Section calculate area - positive")
    void shouldCountArea() {
        final var expectedMsg = "getArea() returns 0 for Section instance.";
        var point1 = new Point(-1, 0);
        var point2 = new Point(-99, 2.5);
        var section = new Section(point1, point2);

        assertThat(section.getArea()).isEqualTo(expectedMsg);
    }
}
