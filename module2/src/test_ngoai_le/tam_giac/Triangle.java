package test_ngoai_le.tam_giac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void inputNumber() throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 < side1){
            throw new IllegalTriangleException("not a triangle");
        } else {
            System.out.println("Right a triangle");
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Nhap so a");
                int a = scanner.nextInt();
                if (a < 0){
                    System.out.println("Please must input number");
                    break;
                }
                System.out.println("Nhap so b");
                int b = scanner.nextInt();
                if (a < 0){
                    System.out.println("Please must input number");
                    break;
                }
                System.out.println("Nhap so c");
                int c = scanner.nextInt();
                if (a < 0){
                    System.out.println("Please must input number");
                    break;
                }
                Triangle triangle = new Triangle(a,b,c);
                triangle.inputNumber();
            } catch (InputMismatchException e){
                System.out.println("please input number");
                scanner.nextLine();
            } catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }


    }
}
