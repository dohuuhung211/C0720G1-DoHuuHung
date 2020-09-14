package lop_va_doi_tuong_04.bai_tap;

import javax.crypto.spec.PSource;
public class XayDungLopFan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

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

    public XayDungLopFan(){
        this.speed = XayDungLopFan.SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public String toString() {
        String result = "Fan: color: " + this.color + ", radius: " + this.radius;
        if (this.on) {
            result += ", speed: " + this.speed + ", fan is on";
        } else {
            result += ", fan is off";
        }
        return result;
    }

    public static void main(String[] args) {
        XayDungLopFan fan1 = new XayDungLopFan();
        fan1.setSpeed(XayDungLopFan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        XayDungLopFan fan2 = new XayDungLopFan();
        fan2.setSpeed(XayDungLopFan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
