package casestudy_module2.controllers;


import java.util.Scanner;

public class FuramaController {
    public static void display() {

        Scanner scanner = new Scanner(System.in);
        int choice;

            System.out.println("===========Menu===========");
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");

        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeManagement.display();
                    break;
                case 2:
                    CustomerManagement.display();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        } while (true);

    }

}


