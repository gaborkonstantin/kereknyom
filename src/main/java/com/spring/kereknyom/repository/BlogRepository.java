package com.spring.kereknyom.repository;

import com.spring.kereknyom.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository <Blog, Long>{
}
