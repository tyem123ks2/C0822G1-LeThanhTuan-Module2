package casestudy_module2.controllers;

import casestudy_module2.services.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagement {
    public static void display(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("===========Menu===========");
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        do {
            System.out.println("Enter your choise");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerService.display();
                    scanner.nextLine();
                    FuramaController.display();
                case 2:
                    customerService.addCustomer();
                    scanner.nextLine();
                    FuramaController.display();
                case 3:
                    customerService.addCustomer();
                    scanner.nextLine();
                    FuramaController.display();
                case 4:
                    FuramaController.display();
            }
        } while (true);
    }
}
