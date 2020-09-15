package accessmodifier_staticmethod_staticproperty.bai_tap;

import accessmodifier_staticmethod_staticproperty.bai_tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle(30);
        System.out.println("Ban kinh hinh tron: " + cir.getRadius());
        System.out.println("Dien tich hinh tron: " + cir.getArea());
    }
}
