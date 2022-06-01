package org.jk;


final class Section extends Polygon {

    private final Point startPoint;
    private final Point endPoint;

    Section(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

}
