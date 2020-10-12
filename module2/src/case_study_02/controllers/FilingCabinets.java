package case_study_02.controllers;

import case_study_02.commons.FileUtils;
import case_study_02.models.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

import static case_study_02.controllers.AddCustomer.listCustomer;
import static case_study_02.controllers.AddCustomer.scanner;
import static case_study_02.controllers.Employee.employeeList;
import static case_study_02.controllers.Employee.map;

public class FilingCabinets {
    private static final String FILE_EMPLOYEE = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\Employee.csv";
    static Stack<Employee> customerStack = new Stack<>();
    public static void cabinet(){

        List<String> stringList = FileUtils.readFile(FILE_EMPLOYEE);
        for (String x: stringList){
            String[] split = x.split(",");
            if (split.length != 1){
                Employee employee = new Employee(split[0],split[1],Integer.parseInt(split[2]),split[3]);
                employeeList.add(employee);
            }
        }
        for (int i = 0; i < employeeList.size(); i++){
            customerStack.push(employeeList.get(i));
        }
        for (Employee list: customerStack){
            System.out.println(list.toString());
        }
    }
    public static void  findCustomer(){
        System.out.println("Nhap thong tin muon tim \n" +
                            "1. Tim theo ten nhan vien \n" +
                            "2. Quay lai menu \n" +
                            "3. Thoat");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input){
            case 1:
                findIdEmployee();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.exit(4);
        }
    }
    public static void findIdEmployee(){
        cabinet();
        System.out.println("Nhap ma nhan vien can tim");
        String findName = scanner.nextLine();
        boolean flag = false;
        for (Employee list: customerStack){
            if (list.getName().equals(findName)){
                System.out.println(list);
                flag = true;
            }
        }
        if (!flag){
            System.err.println("Khong tim thay nhan vien trong danh sach");
        }
    }
}
