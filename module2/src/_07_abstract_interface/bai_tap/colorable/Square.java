package _07_abstract_interface.bai_tap.colorable;

public class Square extends Shape implements Colorable {
    private double size;
    public Square(){};

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getArea(){
        return this.size * this.size;
    }
    public double getPerimeter(){
        return size * 4;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + size
                + ", area of square="
                + getArea()
                + ", which is a subclass of "
                + super.toString()
                + "\n";
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}