package com.example.demob1.shop.service.impl;

import com.example.demob1.shop.entity.Catetory;
import com.example.demob1.shop.repository.CatetoryRepo;
import com.example.demob1.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServicelmpl implements CategoryService {
    @Autowired
    CatetoryRepo catetoryRepo;

    private static final int PAGE_SIZE = 3;

    @Override
    public Page<Catetory> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return catetoryRepo.findAll(pageable);
    }

    @Override
    public void updateCategory(Catetory category) {
        catetoryRepo.save(category);
    }

    @Override
    public void deleteCategoryById(String id) {
        catetoryRepo.deleteById(id);
    }

    @Override
    public void addCategory(Catetory category) {
        catetoryRepo.save(category);
    }

    @Override
    public Catetory getCateById(String id) {
        return catetoryRepo.findById(id).get();
    }

    @Override
    public List<Catetory> getAllCategoryNonPaging() {
        return catetoryRepo.findAll();
    }
}
