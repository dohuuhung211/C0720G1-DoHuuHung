package test;

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

}
