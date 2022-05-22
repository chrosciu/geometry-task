package local.pbaranowski.zadaniejdk17;

public interface SimpleClassName {
    default String getClassName(Object object) {
        return object.getClass().getSimpleName();
    }
}
