package com.example.appblog.repository;

import com.example.appblog.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBlogRepo extends PagingAndSortingRepository<Blog,Integer> {
}
