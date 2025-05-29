package com.spring.kereknyom.service;

import com.spring.kereknyom.domain.Blog;
import com.spring.kereknyom.exception.BlogNotFoundException;
import com.spring.kereknyom.repository.BlogRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BlogService {

    private final BlogRepository blogRepository;
    private final ModelMapper modelMapper;

    public BlogService(BlogRepository blogRepository, ModelMapper modelMapper) {
        this.blogRepository = blogRepository;
        this.modelMapper = modelMapper;
    }


    public Blog findById(Long blogId) {
        return blogRepository.findById(blogId)
                .orElseThrow(() -> new BlogNotFoundException(blogId));
    }
}
