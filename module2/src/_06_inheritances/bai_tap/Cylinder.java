package _06_inheritances.bai_tap;

public class Cylinder extends Circle {
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolumn(){
        return Math.PI * Math.pow(radius,2) * height;
    }

//    @Override
//    public String toString() {
//        return "Hinh tru co ban kinh la " + getRadius() + ", chieu cao la " + getHeight() + " va the tich la "
//                + getVolumn() + " mau la: " + getColor();
//    }

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.setHeight(7);
        cyl.setRadius(5);
        cyl.setColor("blue");
        System.out.println(cyl);
    }
}
