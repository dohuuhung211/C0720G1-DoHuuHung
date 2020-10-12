package case_study_02.controllers;

import case_study_02.commons.FileUtils;
import case_study_02.models.Customer;

import java.util.ArrayList;
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
        employeeList = new ArrayList<>();
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
    public static void findIdEmployee(){
        cabinet();
        System.out.println("Nhap ten nhan vien can tim");
        String findName = scanner.nextLine();
        boolean flag = false;

        while (!customerStack.isEmpty()) {
            if (customerStack.peek().getName().equals(findName)) {
                System.out.println(customerStack.pop());
                flag = true;
                continue;
            }
            customerStack.pop();
        }
        if (!flag){
            System.err.println("Khong tim thay nhan vien trong danh sach");
        }
    }
}
