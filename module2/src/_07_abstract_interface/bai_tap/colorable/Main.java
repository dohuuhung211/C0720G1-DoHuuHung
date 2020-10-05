package _07_abstract_interface.bai_tap.colorable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] arrayShape = new Shape[3];
        arrayShape[0] = new Circle();
        arrayShape[1] = new Rectangle();
        arrayShape[2] = new Square();
        System.out.println(Arrays.toString(arrayShape));
        Circle circle = new Circle(5.5,"red",true);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(3,5,"blue",true);
        System.out.println(rectangle);
        Square square = new Square("yellow",true,5);
        System.out.println(square);
    }
}
