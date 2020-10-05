package _04_class_object.thuc_hanh;

import java.util.Scanner;

class Rectangle {
    public double width, height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangle{" + "chieu rong=" + width + ", chieu cao=" + height + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu dai");
        double height = scanner.nextDouble();
        Rectangle rec = new Rectangle(width,height);
        System.out.println("Dien tich hcn: " + rec.getArea());
        System.out.println("Chu vi hcn: " + rec.getPerimeter());
        System.out.println(rec.display());
    }
}
