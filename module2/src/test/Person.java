package test;

import java.util.Scanner;

public class Person {
    public String ten;
    public Person(String ten){
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String y(){
        return this.ten + " khung";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int a;
        while(!flag){
            a = scanner.nextInt();
            if (a == 5){
                System.out.println("ok");
                flag = true;
            } else {
                System.out.println("Ng");
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
