package accessmodifier_staticmethod_staticproperty.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final double PI = 3.14;
    public void Cirlce(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    protected double getRadius(){
        return this.radius;
    }
    protected double getArea(){
        return PI * Math.pow(radius,2);
    }
}
