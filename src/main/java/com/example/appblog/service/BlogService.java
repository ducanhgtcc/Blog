package com.example.appblog.service;

import com.example.appblog.model.Blog;
import com.example.appblog.repository.IBlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    IBlogRepo iBlogRepo;
    public List<Blog> getAll() {
        return (List<Blog>) iBlogRepo.findAll();
    }
    public void save(Blog blog) {
        iBlogRepo.save(blog);
    }
    public void delete(int id) {
        iBlogRepo.deleteById(id);
    }
    public Blog findById(int id) {
        return iBlogRepo.findById(id).get();
    }
}
