package _15_exception.bai_tap.bai_01;

public class Triangle {
    public double side1;
    public double side2;
    public double side3;

    public Triangle(){};
    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void inputNumber() throws IllegalTriangleException{
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2){
            throw new IllegalTriangleException("not a triangle.");
        } else {
            System.out.println("right a triangle!");
        }

    }
}

