package view;

import controller.ProductController;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);

    ProductController productController = new ProductController();
    public void viewProduct(){

        List<Product> productList= productController.showProduct();
        System.out.println("-------STT------PRICE-------NAME");
        for (int i=0 ; i< productList.size(); i++){

            System.out.println("-------"+ productList.get(i).getId()
                    + "---------"+productList.get(i).getPrice()
                    + "----------" + productList.get(i).getName());
        }
        System.out.println("Nhập vào BACK để quay lại Menu");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){

            new Main();
        }
    }
    public void sortProduct(){

        List<Product>productList= productController.sortProduct();
        System.out.println("-------STT-------PRICE-------NAME");
        for (int i=0 ; i< productList.size(); i++){

            System.out.println("--------"+ productList.get(i).getId()
                    + "--------"+productList.get(i).getPrice()
                    + "--------" + productList.get(i).getName());
        }
        System.out.println("NHAP VAO BACK DE QUAY LAI MENU");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){

            new Main();
        }
    }

}