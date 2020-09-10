public class Test {
    static int myMethodInt(int x, int y){
        return x + y;
    }
    static double myMethodDouble(double x, double y){
        return x + y;
    }
    public static void main(String[] args) {
        int a = myMethodInt(5,5);
        double b = myMethodDouble(5.5,5.0);
        System.out.println(a);
        System.out.println(b);
    }
}
