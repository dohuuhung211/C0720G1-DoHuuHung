package test;

import java.util.ArrayList;
import java.util.List;

public class Person1 {
    public int id;
    public Person1(int id){
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1(1);
        Person1 p2 = new Person1(2);
        Person1 p3 = new Person1(3);
        List<Person1> listPerson = new ArrayList<>();
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(new Person1(4));
        listPerson.add(new Person1(5));
        listPerson.add(new Person1(6));
        listPerson.add(new Person1(7));
        listPerson.remove(0);
        for (Person1 x: listPerson){
            System.out.println(x.getId());
        }
        for (int i = 0; i < listPerson.size(); i++){
            System.out.println(listPerson.get(i).getId());
        }
    }
}
