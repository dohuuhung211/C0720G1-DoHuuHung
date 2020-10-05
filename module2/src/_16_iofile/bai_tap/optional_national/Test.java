package _16_iofile.bai_tap.optional_national;

import java.util.*;

import static _16_iofile.bai_tap.optional_national.National.readFile;

public class Test {
    public static void main(String[] args) {
        List<National> list = readFile();
        for (National x: list){
            System.out.println(x);
        }
    }
}
