package _16_iofile.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args){
//        try {
//            InputStream inStream = new FileInputStream(new File("G:\\C0720G1_Do_Huu_Hung\\" +
//                    "module2\\src\\iofile_16\\bai_tap\\copy_file_text\\Source.csv"));
//            OutputStream outStream = new FileOutputStream(new File("G:\\C0720G1_Do_Huu_Hung\\" +
//                    "module2\\src\\iofile_16\\bai_tap\\copy_file_text\\Finally.csv"));
//            int length;
//            byte[] buffer = new byte[1000];
//
//            while ((length = inStream.read(buffer)) > 0) {
//                outStream.write(buffer, 0, length);
//            }
//            System.out.println("File is copied successful!");
//            inStream.close();
//            outStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        FileInputStream fileInputStream = null;
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileInputStream = new FileInputStream("G:\\C0720G1_Do_Huu_Hung\\module2\\src\\iofile_16\\bai_tap\\copy_file_text\\Source.csv");
//            fileOutputStream = new FileOutputStream("G:\\C0720G1_Do_Huu_Hung\\module2\\src\\iofile_16\\bai_tap\\copy_file_text\\Finally.csv");
//            int check;
//            while ((check = fileInputStream.read()) != -1){
//                System.out.print((char)check);
//                fileOutputStream.write(check);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (fileInputStream != null){
//                try {
//                    fileInputStream.close();
//                } catch (IOException e){
//                    System.out.println("File khong ton tai");
//                }
//            }
//            if (fileOutputStream != null){
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e){
//                    System.out.println("File khong ton tai");
//                }
//            }
        try {
            FileInputStream fileInputStream = new FileInputStream("G:\\C0720G1_Do_Huu_Hung\\modul" +
                    "e2\\src\\iofile_16\\bai_tap\\copy_file_text\\Finally.csv");
            FileOutputStream fileOutputStream = new FileOutputStream("G:\\C0720G1_Do_Huu_Hung\\modul" +
                    "e2\\src\\iofile_16\\bai_tap\\copy_file_text\\Source.csv");
            int check;
            while ((check = fileInputStream.read()) != -1){
                System.out.print((char)check);
                fileOutputStream.write(check);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println("Loi");
            e.printStackTrace();
        }

    }

    }
