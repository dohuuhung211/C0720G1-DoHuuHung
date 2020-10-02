package iofile_16.bai_tap.optional_national;

import iofile_16.bai_tap.optional_national.National;

import java.util.*;

import static iofile_16.bai_tap.optional_national.National.readFile;

public class Test {
    public static void main(String[] args) {
        List<National> list = readFile();
        for (National x: list){
            System.out.println(x);
        }
    }
}
