package casestudy_module2.controllers;

import casestudy_module2.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    public static void display(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

            System.out.println("===========Menu===========");
            System.out.println("1.\tDisplay list employees\n" +
                    "2.\tAdd new employee\n" +
                    "3.\tDelete employee\n" +
                    "4.\tEdit employee\n" +
                    "5.\tReturn main menu\n");


        do {
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeService.display();
                    scanner.nextLine();
                    FuramaController.display();
                case 2:
                    employeeService.addEmployee();
                    scanner.nextLine();
                    FuramaController.display();
                case 3:
                    employeeService.deleteEmployee();
                    scanner.nextLine();
                    FuramaController.display();
                case 4:
                    employeeService.editEmployee();
                    scanner.nextLine();
                    FuramaController.display();
                case 5:
                    FuramaController.display();

            }




        } while (true);
    }
}
