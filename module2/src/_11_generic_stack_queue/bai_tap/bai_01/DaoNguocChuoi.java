package _11_generic_stack_queue.bai_tap.bai_01;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        String stringName = "do huu hung alo ola";
//        String[] arrayStr = stringName.split(" ");
//        for (int i = 0; i < arrayStr.length; i++){
//            System.out.printf(arrayStr[i] + "\t");
//        }
//        for (int i = 0; i < arrayStr.length / 2; i++){
//            String temp = arrayStr[i];
//            arrayStr[i] = arrayStr[arrayStr.length - 1 - i];
//            arrayStr[arrayStr.length - 1 - i] = temp;
//        }
//
//        Stack<String> wStack = new Stack<>();
//        wStack.push(Arrays.toString(arrayStr));
//        System.out.println(wStack);
        String[] arrStr = stringName.split(" ");
        for (int i = 0; i < arrStr.length; i++){
            System.out.printf(arrStr[i] + "t");
        }
        for (int i = 0; i < arrStr.length / 2; i++){
            String temp = arrStr[i];
            arrStr[i] = arrStr[arrStr.length - 1 - i];
            arrStr[arrStr.length - 1 - i] = temp;
        }
        Stack<String> wStack = new Stack<>();
        wStack.push(Arrays.toString(arrStr));
        System.out.println(wStack);
    }
}
