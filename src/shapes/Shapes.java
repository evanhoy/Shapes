/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author evanhoy
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testCircle();
        testRectangle();
    }

    private static void testCircle() {
        Circle myCircle = new Circle();
        myCircle.setRadius(5.5);
        System.out.println("Circle");
        System.out.printf(" radius        = %.2f \n", myCircle.getRadius());
        System.out.printf(" diameter      = %.2f \n", myCircle.getDiameter());
        System.out.printf(" circumference = %.2f \n", myCircle.getCircumference());
        System.out.printf(" area          = %.2f \n", myCircle.getArea());

        myCircle.getRadius();
    }

    private static void testRectangle() {
        Rectangle myRectangle = new Rectangle();
        myRectangle.setLength(4.5);
        myRectangle.setWidth(2);
        System.out.println("Rectangle");
        System.out.printf(" length    = %.2f \n", myRectangle.getLength());
        System.out.printf(" width     = %.2f \n", myRectangle.getWidth());
        System.out.printf(" perimeter = %.2f \n", myRectangle.getPerimeter());
        System.out.printf(" area      = %.2f \n", myRectangle.getArea());

    }

}
