package local.pbaranowski.zadaniejdk17;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(2.0, 3.0);
        var point2 = new Point(5.0,10.0);
        log(point1.distance(point2));
        log(point1.distance(null));
        var circle1 = new Circle(point1,2.0);

        try {
            var circle2 = new Circle(point2, -2.0);
        } catch (NegativeRadiusException e) {
            log(e.getMessage());
        }

        log(circle1.getArea());

        var section = new Section(point1,point2);
        var triangle = new Triangle(point1,point2,new Point(7.0,20.0));

        log(circle1.getDiameter());
        log(section.getDiameter());
        log(triangle.getDiameter());

    }

    public static void log(String message) {
        System.out.println(message);
    }
}