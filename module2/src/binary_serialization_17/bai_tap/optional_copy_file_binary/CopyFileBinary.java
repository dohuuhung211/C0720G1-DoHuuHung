package binary_serialization_17.bai_tap.optional_copy_file_binary;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFileBinary {
    public static final String FILE_SOURCE = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\" +
            "binary_serialization_17\\bai_tap\\optional_copy_file_binary\\Source.csv";
    public static final String FILE_TARGET = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\" +
            "binary_serialization_17\\bai_tap\\optional_copy_file_binary\\Source.csv";
    public static void main(String[] args) {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File(FILE_SOURCE));
            outStream = new FileOutputStream(new File(FILE_TARGET));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
