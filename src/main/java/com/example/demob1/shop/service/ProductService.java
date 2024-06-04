package com.example.demob1.shop.service;

import com.example.demob1.shop.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();

    public void addProduct(Product product);
}
