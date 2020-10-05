package _06_inheritances.bai_tap;

public class Triangle extends Shape {
    double size1 = 1.0;
    double size2 = 1.0;
    double size3 = 1.0;
    public Triangle(){};
    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getArea(){
        return Math.sqrt((this.size1 + this.size2 + this.size3) * (this.size1 + this.size2 - this.size3) *
                (this.size2 + this.size3 - this.size1) * (this.size3 + this.size1 - this.size2)) / 4;
    }
    public double getPerimeter(){
        return this.size1 + this.size2 + this.size3;
    }

    @Override
    public String toString() {
        return super.toString() + ", dien tich=" +
                getArea() + ", chu vi=" + getPerimeter();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("blue", true, 5,6,7);
        System.out.println(triangle);
    }
}
