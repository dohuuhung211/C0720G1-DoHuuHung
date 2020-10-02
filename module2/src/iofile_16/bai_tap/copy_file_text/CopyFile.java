package iofile_16.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inStream = new FileInputStream(new File("G:\\C0720G1_Do_Huu_Hung\\" +
                    "module2\\src\\iofile_16\\bai_tap\\copy_file_text\\Source.csv"));
            OutputStream outStream = new FileOutputStream(new File("G:\\C0720G1_Do_Huu_Hung\\" +
                    "module2\\src\\iofile_16\\bai_tap\\copy_file_text\\Finally.csv"));
            int length;
            byte[] buffer = new byte[1000];

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
            inStream.close();
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
