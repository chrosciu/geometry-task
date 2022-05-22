package local.pbaranowski.zadaniejdk17;

public class NegativeRadiusException extends RuntimeException implements Message {
    private double radius;

    public NegativeRadiusException(double radius) {
        this.radius = radius;
    }

    @Override
    public String getMessage() {
        return formatMessage("Negative radius " + radius);
    }
}
