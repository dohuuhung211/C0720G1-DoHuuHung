package test;
import java.io.IOException;
import java.util.*;
import java.io.DataInput;
import java.io.DataInputStream;

public class Tesst {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(System.in);
        System.out.println("Nhap so N");
        int n = dataInputStream.readInt();
        System.out.println(n);
    }
}
