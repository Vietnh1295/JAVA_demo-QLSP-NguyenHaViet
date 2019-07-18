package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();

    public Product[] showList() {
        return productService.showList();
    }

    public int size() {
        return productService.size();
    }

    public boolean addProduct(int index, Product Product) {
       return   productService.addProduct(index, Product);
    }

    public void removeProduct(int index) {
        productService.removeProduct(index);
    }

    public Product setProduct(int index, Product Product) {
        return productService.setProduct(index, Product);
    }

    public int findByName(String ProductName) {
        return productService.findByName(ProductName);
    }
    public Product[] sortByPrice() {
        return productService.sortByPrice();
    }

}
