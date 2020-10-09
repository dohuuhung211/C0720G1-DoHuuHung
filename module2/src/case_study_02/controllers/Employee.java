package case_study_02.controllers;

import _12_java_collection_framework.thuc_hanh.optional.Tree;
import _12_java_collection_framework.thuc_hanh.thuc_hanh_02.Student;
import case_study_02.commons.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Employee {
    static final String FILE_EMPLOYEE = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\Employee.csv";
    String name;
    int yearOld;
    String address;
    public Employee(){}
    public Employee(String name, int yearOld, String address) {
        this.name = name;
        this.yearOld = yearOld;
        this.address = address;
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOld=" + yearOld +
                ", address='" + address + '\'' +
                '}';
    }

    public static void showAllEmployee() {
        TreeMap<String,Employee> map = new TreeMap<>();
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = FileUtils.readFile(FILE_EMPLOYEE);
        for (String x: stringList){
            String[] split = x.split(",");
            if (split.length != 1){
                Employee employee = new Employee(split[0],Integer.parseInt(split[1]),split[2]);
                employeeList.add(employee);
            }
        }
        map.put("001",employeeList.get(0));
        map.put("002",employeeList.get(1));
        map.put("003",employeeList.get(2));
        map.put("004",employeeList.get(3));
        map.put("005",employeeList.get(4));
        map.put("006",employeeList.get(5));
        map.put("007",employeeList.get(6));
        map.put("008",employeeList.get(7));
        map.put("009",employeeList.get(8));
        map.put("010",employeeList.get(9));
        for(Map.Entry<String, Employee> x : map.entrySet()){
            System.out.println(x.toString());
        }
    }
    public static void main(String[] args) {

    }
}
