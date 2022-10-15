package com.eqbank.designpattern.factory;

public class FactoryTest {

    public static void main(String[] args) {

        PolygonFactory polygonFactory = new PolygonFactory();
        Polygon polygon = polygonFactory.getPolygon(3);
        System.out.println("Polygon for sides 3 is "+polygon.getType());

        polygon = polygonFactory.getPolygon(4);
        System.out.println("Polygon for sides 4 is "+polygon.getType());
    }
}
