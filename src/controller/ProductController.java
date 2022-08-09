package controller;

import model.Product;
import service.IProductService;
import service.ProductServiceIMPL;

import java.util.List;

public class ProductController {
    private IProductService iProductService =new ProductServiceIMPL();

    public List<Product> showProduct(){
        return iProductService.findAll();

    }
    public List<Product > sortProduct(){
        return iProductService.sortByPrice();

    }

}