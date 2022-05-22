package local.pbaranowski.zadaniejdk17;

public interface Message extends SimpleClassName {
    default String formatMessage(String message) {
        return getClassName(this) + ": " + message;
    }
}
