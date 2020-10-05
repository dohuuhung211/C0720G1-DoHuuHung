package _06_inheritances.bai_tap;

public class Circle {
    public double radius;
    public String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

//    @Override
//    public String toString() {
//        return "Hinh tron co mau " + getColor() + ", ban kinh la " + getRadius() + " va dien tich la " + getArea();
//    }

    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.setColor("red");
        cir.setRadius(5);
        System.out.println(cir);
    }
}
