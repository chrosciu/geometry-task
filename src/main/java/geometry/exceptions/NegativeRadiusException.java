package geometry.exceptions;

public class NegativeRadiusException extends RuntimeException {
    public NegativeRadiusException(double radius) {
        super("Provided negative radius " + radius);
    }
}
