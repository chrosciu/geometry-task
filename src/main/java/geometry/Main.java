package geometry;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class.toString());

        var point = new Point(2, 4);
        logger.info(point.distance(new Point(1, 2)));

        var section = new Section(new Point(2, 3),
                                  new Point(4, 4));
        logger.info(section.getArea());
        logger.info(section.getDiameter());

        var circle = new Circle(point, 2);
        logger.info(circle.getArea());
        logger.info(circle.getDiameter());

        var triangle = new Triangle(new Point(2, 2),
                                    new Point(1, 1),
                                    new Point(3, 3));
        logger.info(triangle.getArea());
        logger.info(triangle.getDiameter());

    }
}
