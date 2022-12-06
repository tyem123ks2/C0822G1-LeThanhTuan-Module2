package ss12_java_collection_framework.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager extends Product {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> myArrayList = new ArrayList<>();
    Product product1 = new Product("Thần trùng", 84, 75000);
    Product product2 = new Product("Valorant", 80, 100000);
    Product product3 = new Product("PlayerUnknownsBattleGround", 78, 360000);

    {
        myArrayList.add(product1);
        myArrayList.add(product2);
        myArrayList.add(product3);

    }

    public void display() {
        System.out.println("Danh sách sản phẩm: ");
        System.out.println(myArrayList);
    }

    public void add() {
        Product product = new Product();
        System.out.println("Nhập ID sản phẩm: ");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên sản phẩm: ");
        product.setProductName(scanner.nextLine());
        System.out.println("Nhập giá tiền sản phẩm: ");
        product.setPrice(Integer.parseInt(scanner.nextLine()));
        myArrayList.add(product);
        display();
    }

    public void editProduct() {
        System.out.println("Nhập ID sản phẩm muốn chỉnh sửa thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : myArrayList) {
            if (product.getId() == id) {
                System.out.println("Nhập game mới: ");
                product.setProductName(scanner.nextLine());
                System.out.println("Nhập giá game mới: ");
                product.setPrice(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập ID game mới: ");
                product.setId(Integer.parseInt(scanner.nextLine()));
                return;
            }

        }
        System.out.println("Mã ID nhập vào chưa đúng.");

    }

    public void deleteProduct() {
        System.out.println("Nhập ID sản phẩm muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        myArrayList.removeIf(product -> product.getId() == id);
        display();
    }

    public void sreachProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên game muốn tìm kiếm: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (Product product : myArrayList) {
            if (product.getProductName().equals(name)) {
                check = true;
                System.out.println(product.toString());
//                return;
            }
        }
            if (check == false) {
                System.out.println("không tìm thấy");
            }
//        System.out.println("Không tìm thấy");
    }
    public void sortProduct() {
        Collections.sort(myArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        display();
    }


}

