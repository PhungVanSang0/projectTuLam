package com.example.demob1.shop.service;

import com.example.demob1.shop.entity.Catetory;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    public Page<Catetory> getAllCategory(int p);

    public void updateCategory(Catetory category);

    public void deleteCategoryById(String id);

    public void addCategory(Catetory category);

    public Catetory getCateById(String id);

    public List<Catetory> getAllCategoryNonPaging();
}
