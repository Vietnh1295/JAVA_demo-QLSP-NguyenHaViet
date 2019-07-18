package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;

public class ProductService implements GeneralService<Product> {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public Product[] showList() {
        return productRepository.showList();
    }

    @Override
    public int size() {
        return productRepository.size();
    }

    @Override
    public boolean addProduct(int index, Product Product) {
       return productRepository.addProduct(index, Product);
    }

    @Override
    public void removeProduct(int index) {
         productRepository.removeProduct(index);
    }

    @Override
    public Product setProduct(int index, Product Product) {
        return productRepository.setProduct(index, Product);
    }

    @Override
    public int findByName(String ProductName) {
        return productRepository.findByName(ProductName);
    }

    @Override
    public Product[] sortByPrice() {
        return productRepository.sortByPrice();
    }



}
