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
class Resource{
    public String toString(){
        return "a";
    }
}
class Human extends Resource{
    public String toString(){
        return "b";
    }
}
class Human2 extends Resource{
    public String toString(){
        return "c";
    }
}
class Main{
    public static void main(String[] args) {
        Human n = new Human();
        Resource n2 = n;
        Resource n3 = (Resource) n2;
        System.out.println(n+"." + n2+"." + n3);
    }
}