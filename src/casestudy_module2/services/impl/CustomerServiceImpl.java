package casestudy_module2.services.impl;

import casestudy_module2.models.person.Customer;
import casestudy_module2.services.CustomerService;

import java.util.LinkedList;
import java.util.Scanner;

;

public class CustomerServiceImpl implements CustomerService {

    Scanner scanner = new Scanner(System.in);
    public static LinkedList<Customer> customerList = new LinkedList<>();

    static {
        Customer customer1 = new Customer("Jinx", "10/11/1996", "Female", "1785422369", "0912020147", "Jinx2019@gmail.com", "M132", Customer.PLATINIUM, "295 Nguyễn Tất Thành, Hải Châu, Đà Nẵng");
        Customer customer2 = new Customer("Zed", "19/01/1999", "Male", "1589541369", "0912058417", "Zed21019@gmail.com", "M122", Customer.GOLD, "05 Hà Thị Thân, Sơn Trà, Đà Nẵng");
        customerList.add(customer1);
        customerList.add(customer2);
    }

    public static void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public void addCustomer() {
        Customer customer = new Customer();
        System.out.println("Nhập tên khách hàng: ");
        customer.setName(scanner.nextLine());
        System.out.println("Nhập ngày sinh khách hàng");
        customer.setDate(scanner.nextLine());
        System.out.println("Male/Female?");
        customer.setGender(scanner.nextLine());
        System.out.println("Nhập CMND khách hàng");
        customer.setIdCard(scanner.nextLine());
        System.out.println("Nhập SĐT khách hàng:");
        customer.setPhoneNumber(scanner.nextLine());
        System.out.println("Nhập Email khách hàng:");
        customer.setEmail(scanner.nextLine());
        System.out.println("Nhập mã khách hàng");
        customer.setIdCustomer(scanner.nextLine());
        System.out.println("Chọn loại khách hàng" +
                "1. Member." +
                "2. Silver." +
                "3. Gold" +
                "4. Platinium." +
                "5. Diamond.");
        String level = "";
        int selec1;
        do {
            selec1 = Integer.parseInt(scanner.nextLine());
            switch (selec1) {
                case 1:
                    level = Customer.MEMBER;
                    break;
                case 2:
                    level = Customer.SILVER;
                    break;
                case 3:
                    level = Customer.GOLD;
                    break;
                case 4:
                    level = Customer.PLATINIUM;
                    break;
                case 5:
                    level = Customer.DIAMOND;
                    break;
                default:
                    System.out.print("Vui lòng chọn lại");
            }
        } while (selec1 > 5 || selec1 < 1);
        customer.setRank(level);
        System.out.println("Nhập địa chỉ của khách hàng:");
        customer.setAddress(scanner.nextLine());
        customerList.add(customer);
        display();
    }
}
