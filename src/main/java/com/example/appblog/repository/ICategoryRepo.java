package com.example.appblog.repository;

import com.example.appblog.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICategoryRepo extends PagingAndSortingRepository<Category,Integer> {
}
