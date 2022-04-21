package collectionframework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.add(new Product("Laptop",100000));
        productManager.add(new Product("Iphone13",10000000));
        productManager.add(new Product("Iphone12", 800000));
        productManager.add(new Product("Iphone12ProMax",200000));
        productManager.add(new Product("Iphone11",1300000));


        productManager.display();
//        productManager.delete(2);
//        System.out.println("Sau khi xóa là : ");
//        productManager.display();
//        productManager.sort();
//        System.out.println("So sánh theo giá tăng dần");
//        for (Product product: productManager.products){
//            System.out.println(product.toString());
//        }
    }
}
