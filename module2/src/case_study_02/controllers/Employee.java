package case_study_02.controllers;

import _12_java_collection_framework.thuc_hanh.optional.Tree;
import _12_java_collection_framework.thuc_hanh.thuc_hanh_02.Student;
import case_study_02.commons.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Employee {
    static List<Employee> employeeList = new ArrayList<>();
    static TreeMap<String,Employee> map = new TreeMap<>();
    static final String FILE_EMPLOYEE = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\Employee.csv";
    String id;
    String name;
    int yearOld;
    String address;
    public Employee(){}
    public Employee(String id, String name, int yearOld, String address) {
        this.id = id;
        this.name = name;
        this.yearOld = yearOld;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Ho Ten: " + name +
                ", tuoi: " + yearOld +
                ", dia chi: " + address;
    }

    public static void showAllEmployee() {
        List<String> stringList = FileUtils.readFile(FILE_EMPLOYEE);
        for (String x: stringList){
            String[] split = x.split(",");
            if (split.length != 1){
                Employee employee = new Employee(split[0],split[1],Integer.parseInt(split[2]),split[3]);
                employeeList.add(employee);
            }
        }
        for (int i = 0; i < employeeList.size(); i++){
            map.put(employeeList.get(i).getId(),employeeList.get(i));
        }

        for(Map.Entry<String, Employee> employeeEntry : map.entrySet()){
            System.out.println("Ma nhan vien: " + employeeEntry.getKey() + ", " + employeeEntry.getValue().toString());
        }
        System.out.println("---------------------------------------------------------");
    }
}
