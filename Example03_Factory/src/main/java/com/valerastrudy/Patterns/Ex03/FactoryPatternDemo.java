package com.valerastrudy.Patterns.Ex03;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        //get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        //get an object of Square and call its draw method
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }
}
