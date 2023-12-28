package com.example.demo;

public class LambdaExpressions {

    public static void main(String[] args) {

        Shape shape = () -> System.out.println("In draw method");
        Shape circle = () -> System.out.println("In circle method");
        Shape square = () -> System.out.println("In square method");

        shape.draw();
        circle.draw();
        square.draw();
        shape.dispaly();
        Shape.saticMethod();
    }

    interface Shape {
        public void draw();

        default void dispaly() {
            System.out.println("default dispaly...");
        }

        static void saticMethod() {
            System.out.println("static method...");
        }

    }

    /**
     * comment out the below code used before java8
      */

//    class Circle implements Shape {
//
//        @Override
//        public void draw() {
//            System.out.println("In Circle Shape");
//        }
//    }
//    class Square implements Shape {
//
//        @Override
//        public void draw() {
//            System.out.println("In Square Shape");
//        }
//    }
}
