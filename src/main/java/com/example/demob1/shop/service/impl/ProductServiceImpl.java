package com.example.demob1.shop.service.impl;
import com.example.demob1.shop.entity.Product;
import com.example.demob1.shop.repository.ProductRepo;

import com.example.demob1.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }

    @Override
    public void addProduct(Product product){
        productRepo.save(product);
    }
}
