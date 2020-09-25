package test.shape;

import test.Person;

public class Employee extends Person {
    public Employee(String ten) {
        super(ten);
    }

    public void luong(){
        System.out.println("luong nv");
    }

    @Override
    public String toString() {
        return "Hung ";
    }

    public static void main(String[] args) {

        Person b = new Employee("Dien");
        Person c = new Employee("a");
//        Employee k = (Employee) b;
//        System.out.println(k.toString());
        ((Employee) c).luong();
//        k.luong();
    }
}
