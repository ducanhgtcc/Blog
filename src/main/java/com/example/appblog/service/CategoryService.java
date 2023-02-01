package com.example.appblog.service;

import com.example.appblog.model.Category;
import com.example.appblog.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    ICategoryRepo iCategoryRepo;
    public List<Category> getAll() {
        return (List<Category>) iCategoryRepo.findAll();
    }
    public Category findById(int id) {
        return iCategoryRepo.findById(id).get();
    }
}
