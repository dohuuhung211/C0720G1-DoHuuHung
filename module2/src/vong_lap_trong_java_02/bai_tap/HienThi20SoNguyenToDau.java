package vong_lap_trong_java_02.bai_tap;

public class HienThi20SoNguyenToDau {
    public static void main(String[] args) {
        String numb = "";
        int count = 0;
        int n = 2;
        while (count < 20){
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
                numb += n + ", ";
            }
            n++;
        }
        System.out.print(numb);

    }
}
