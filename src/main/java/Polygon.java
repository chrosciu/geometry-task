public abstract sealed class Polygon implements Shape permits Section, Triangle {
    private int corners;

    public Polygon(int corners) {
        if (corners <= 0)
            throw new IllegalArgumentException("Corners must be of positive number.");
        this.corners = corners;
    }
}
