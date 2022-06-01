package org.jk;


abstract sealed class Polygon implements Shape permits Section, Triangle {


    @Override
    public String getArea() {

        return String.format("Area of %s is unknown", this.getClass().getSimpleName());
    }


}
