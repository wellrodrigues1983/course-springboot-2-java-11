package com.wrsolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrsolution.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
