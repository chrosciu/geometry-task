package local.pbaranowski.zadaniejdk17;

public sealed interface Shape extends SimpleClassName permits Circle, Polygon {
    String getArea();

    default String getDiameter() {
        return switch (this) {
            case Circle c -> String.format("%s: getDiameter((%f  %f)  %f)"
                    ,getClassName(c)
                    ,c.center().x()
                    ,c.center().y()
                    ,c.radius()
            );
            case Section s -> String.format("%s: getDiameter((%f  %f)  (%f  %f))"
                    ,getClassName(s)
                    ,s.getCorners().get(0).x()
                    ,s.getCorners().get(0).y()
                    ,s.getCorners().get(1).x()
                    ,s.getCorners().get(1).y()
            );
            case Triangle t -> String.format("%s: getDiameter((%f  %f)  (%f  %f)  (%f  %f))"
                    ,getClassName(t)
                    ,t.getCorners().get(0).x()
                    ,t.getCorners().get(0).y()
                    ,t.getCorners().get(1).x()
                    ,t.getCorners().get(1).y()
                    ,t.getCorners().get(2).x()
                    ,t.getCorners().get(2).y()
                    );
            default -> "Unknown";
        };
    }
}
