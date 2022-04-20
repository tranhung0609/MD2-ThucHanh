package collectionframework;

public interface Manage<Product> {
    void add(Product product);

    void eidt(int id, Product product);

    void delete(int id);

    void display();

    Product find(int id);

    void sort();

    int findById(int id);

    int compare (collectionframework.Product o1, collectionframework.Product o2);
}
