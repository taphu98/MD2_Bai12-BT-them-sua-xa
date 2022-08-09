package service;

import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1, 50 ,"Apple"));
        productList.add(new Product(2, 80 ,"Sam Sung"));
        productList.add(new Product(3, 100 ,"Apple"));
        productList.add(new Product(4, 10 ,"Sam Sung"));
    }

    @Override
    public  List<Product> sortByPrice() {
        Collections.sort(productList);
        return productList;
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

}