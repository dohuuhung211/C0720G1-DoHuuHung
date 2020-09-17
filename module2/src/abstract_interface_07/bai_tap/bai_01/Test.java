package abstract_interface_07.bai_tap.bai_01;

public class Test {
    public static void main(String[] args) {
        Circle cir = new Circle(10,"red",true);
        System.out.println(cir);
        Rectangle rec = new Rectangle(5,5);
        System.out.println(rec);
        Square square = new Square(7);
        System.out.println(square);
    }
}
