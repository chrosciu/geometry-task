import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


@Slf4j
public class SquareTest {

    @Test
    @DisplayName("Square create - positive")
    void shouldCreateSquareOfPositiveSide() {
        var side = 2;
        assertThat(new Square(side)).isExactlyInstanceOf(Square.class);
    }

    @Test
    @DisplayName("Square side negative - exception")
    void shouldThrowExceptionWhenNegativeSide() {
        final var expectedMsg = "Side cannot be negative.";
        var negativeSide = -2;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Square(negativeSide));
        assertThat(exception.getMessage()).isEqualTo(expectedMsg);
    }
}
