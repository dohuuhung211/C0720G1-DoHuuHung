package demo_exception;

public class Demo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println("Trong try");
        } catch (Exception e){
            System.out.println("Ngoai le: NullPointerException");
            System.out.println("trong catch");
        }
        System.out.println("ngoai try catch");
    }
}
