//public class Test {
//    public static void main(String [] args)     {
//        try {
//            badMethod();
//            System.out.print("A");
//        }catch (RuntimeException ex){
//            System.out.print("B");
//        }catch (Exception ex1){
//            System.out.print("C");
//        }finally{
//            System.out.print("D");
//        }
//        System.out.print("E");
//    }
//    public static void badMethod(){
//        throw new RuntimeException();
//    }
//}
//public class Test {
//    public static void main(String [] args) {
//        try         {
//            badMethod();
//            System.out.print("A");
//        }  catch (Exception ex)  {
//            System.out.print("B");
//        } finally {
//            System.out.print("C");
//        }
//        System.out.print("D");
//    }
//    public static void badMethod(){
//        throw new Error();
//    }
//}
public class Test {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 5 / x;
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }catch (Exception ae) {
            System.out.println("Exception");
        }
        System.out.println("finished");
    }
}