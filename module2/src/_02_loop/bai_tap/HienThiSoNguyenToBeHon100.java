package _02_loop.bai_tap;

public class HienThiSoNguyenToBeHon100 {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100");
        for (int i = 0; i < 100; i++) {
            if (soNguyenTo(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int canBacHai = (int) Math.sqrt(n);
        for (int i = 2; i <= canBacHai; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}