package com.spring.kereknyom.exception;

import lombok.Getter;

@Getter
public class BlogNotFoundException extends RuntimeException {

  private final Long blogId;


    public BlogNotFoundException(Long blogId) {
        super("Blog not found with id: " + blogId);
        this.blogId = blogId;
    }
}
