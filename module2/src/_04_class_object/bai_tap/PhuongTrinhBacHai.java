package _04_class_object.bai_tap;

import java.util.Scanner;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double x;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b, double c, double x) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
    }
    public double quadrEqua(){
        return a * (x*x) + b * x + c;
    }
    public double getA() {
        return this.a = a;
    }

    public double getB() {
        return this.b = b;
    }

    public double getC() {
        return this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b*b) - 4*a*c) / 2*a;
    }
    public double getRoot2(){
        return -b - Math.sqrt(b*b) / 2*a;
    }
    public double getRoot3(){
        return -b/2*a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 2");
        System.out.println("Nhap a");
        double a = scanner.nextDouble();
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        System.out.println("Nhap c");
        double c = scanner.nextDouble();
        System.out.println("Nhap x");
        double x = scanner.nextDouble();

        QuadraticEquation quadr = new QuadraticEquation(a,b,c,x);
        double quadrEqua = quadr.quadrEqua();

        System.out.println("Ket qua phuong trinh la: " + quadrEqua);
        double delta = quadr.getDiscriminant();
        System.out.println("Delta la: " + delta);
        if (delta > 0){
            System.out.println("Phuong trinh co 2 nghiem:");
            System.out.println("Nghiem x1 = " + quadr.getRoot1());
            System.out.println("Nghiem x2 = " + quadr.getRoot2());
        } else if (delta == 0){
            System.out.println("Phuong trinh co nghiem kep: " + quadr.getRoot3());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}