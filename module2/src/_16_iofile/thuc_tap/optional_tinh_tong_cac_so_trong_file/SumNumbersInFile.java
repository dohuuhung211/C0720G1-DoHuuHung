package _16_iofile.thuc_tap.optional_tinh_tong_cac_so_trong_file;

import java.io.*;
import java.util.Scanner;

public class SumNumbersInFile {
    public static void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tong: " + sum);
        } catch (IOException e){
            System.err.println("file khong ton tai");
        } catch (Exception e) {
            System.err.println("Hay nhap so");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap duong dan");
        String filePath = scanner.nextLine();
        readFileText(filePath);
    }
}
