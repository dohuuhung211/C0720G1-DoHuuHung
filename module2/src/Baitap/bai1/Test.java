package Baitap.bai1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test implements Comparable<Test>{
    public String name;
    public int id;
    public Test(){
    }
    public Test(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: " + id + " " +
                "Name: " + name;
    }

    @Override
    public int compareTo(Test test) {
        int result = test.getId() - this.id;
        if (result == 0){
            return this.name.compareTo(test.getName());
        }
        return result;
    }

}
