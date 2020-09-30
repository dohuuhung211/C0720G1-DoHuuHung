package xu_ly_ngoai_le_debug_15.bai_tap.bai_01;

public class IllegalTriangleException extends Exception{
    String message;
    public IllegalTriangleException(String massage){
        super(massage);
    }
    public String getString(){
        return message;
    }
}
