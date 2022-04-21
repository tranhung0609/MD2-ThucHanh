package collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class ProductManager implements Manage<Product> {
    LinkedList<Product> products = new LinkedList<>();
    int count = 1;
    @Override
    public void add(Product product) {
        product.setId(count++);
        products.add(product);
    }


    @Override
    public void eidt(int id, Product product) {
        if (findById(id) != -1) {
            products.set(findById(id), product);
        } else {
            System.out.println("Không có trong danh sách");
        }
    }

    @Override
    public void delete(int id) {
        if (findById(id) != -1) {
            products.remove(findById(id));
        } else {
            System.out.println("Không có trong danh sách");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    @Override
    public Product find(int id) {

        return null;
    }

    @Override
    public void sort() {
        Collections.sort(products);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int compare(Product o1, Product o2){
        if (o1.getPrice()>o2.getPrice()){
            return 1;
        } else if (o1.getPrice() == o2.getPrice()){
            return 0;
        } else {
            return -1;
        }
    }
}
