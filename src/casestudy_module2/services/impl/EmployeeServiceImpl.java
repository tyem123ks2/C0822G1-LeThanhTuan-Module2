package casestudy_module2.services.impl;

import casestudy_module2.models.person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee("Reyna", "10/11/1998", "Male", "197434279", "0359066333", "thanhtuan02051011@gmail.com", Employee.UNIVERSITY, Employee.CEO, 250000000);
        Employee employee2 = new Employee("Chamber", "20/12/1999", "Male", "197478419", "0359887233", "Chambruhhh1@gmail.com", Employee.AFTER_UNIVERSITY, Employee.STAFF, 5000000);
        employeeList.add(employee1);
        employeeList.add(employee2);

    }

    public static void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void addEmployee() {
        Employee employee = new Employee();
        System.out.println("Nhập tên nhân viên");
        employee.setName(scanner.nextLine());
        System.out.println("Nhập ngày sinh");
        employee.setDate(scanner.nextLine());
        System.out.println("Nhập giới tính - (Male/Female)");
        employee.setGender(scanner.nextLine());
        System.out.println("Nhập CMND: ");
        employee.setIdCard(scanner.nextLine());
        System.out.println("Nhập số điện thoại");
        employee.setPhoneNumber(scanner.nextLine());
        System.out.println("Nhập email của nhân viên: ");
        employee.setEmail(scanner.nextLine());
        System.out.println("Chọn trình độ học của nhân viên:");
        System.out.println("Học vấn\n" +
                "1. Trung Cấp\n" +
                "2. Cao đẳng\n" +
                "3. Đại học\n" +
                "4. Sau đại học\n");
        String level = "";
        int selection;
        do {
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    level = Employee.IMTERMEDIATE;
                    break;
                case 2:
                    level = Employee.COLLAGE;
                    break;
                case 3:
                    level = Employee.UNIVERSITY;
                    break;
                case 4:
                    level = Employee.AFTER_UNIVERSITY;
                    break;
                default:
                    System.out.println("Không hợp lệ vui lòng nhập lại");
            }
        } while (selection > 4 || selection < 1);
        employee.setLevel(level);
        String stadard = "";
        System.out.println("Vị trí\n" +
                "1. Lễ tân\n" +
                "2. Phục vụ\n" +
                "3. Chuyên viên\n" +
                "4. Giám sát\n" +
                "5. Quản lí\n" +
                "6. Giám đốc\n");
        int selection2;
        do {
            selection2 = Integer.parseInt(scanner.nextLine());
            switch (selection2) {
                case 1:
                    stadard = Employee.RECEPTIONIST;
                    break;
                case 2:
                    stadard = Employee.STAFF;
                    break;
                case 3:
                    stadard = Employee.EXPERT;
                    break;
                case 4:
                    stadard = Employee.MONITORING;
                    break;
                case 5:
                    stadard = Employee.MANAGE;
                    break;
                case 6:
                    stadard = Employee.CEO;
                    break;
                default:
                    System.out.println("Không hợp lệ vui lòng nhập lại");
            }
        } while (selection2 > 6 || selection2 < 1);
        employee.setStandard(stadard);
        System.out.println("Nhập lương");
        employee.setSalary(Integer.parseInt(scanner.nextLine()));
        employeeList.add(employee);
        display();
    }

    public void editEmployee() {
        System.out.println("Nhập CMND nhân viên muốn chỉnh sửa thông tin");
        String id1 = scanner.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getIdCard().equals(id1)) {
                System.out.println(employee.getIdCard());
                System.out.println("Nhập tên cần chỉnh sửa lại:");
                employee.setName(scanner.nextLine());
                System.out.println("Nhập ngày sinh cần chỉnh sửa:");
            }
        }

    }

    public void deleteEmployee() {
        System.out.println("Nhập CMND của nhân viên muốn xóa trong danh sách: ");
        String id = scanner.nextLine();
        employeeList.removeIf(idcard -> idcard.getIdCard().equals(id));
        display();
    }
}


