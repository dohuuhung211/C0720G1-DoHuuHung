package _15_exception.bai_tap.bai_01;

public class IllegalTriangleException extends Exception{
    String message;
    public IllegalTriangleException(String massage){
        super(massage);
    }
}
