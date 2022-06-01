package org.jk;


record Point(double x, double y) {

    public String distance(Point p) {

        double distance = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));

        return String.format("distance = %d", distance);
    }

}