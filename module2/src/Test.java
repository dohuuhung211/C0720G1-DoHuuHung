import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static public void m(int[] x) {
        x[0] = 200;
    }
    public static void main(String[] args) {
        int[] a = {50, 100};
        m(a);
        System.out.println(a[0]);
    }
}
