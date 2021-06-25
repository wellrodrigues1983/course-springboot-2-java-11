package com.wrsolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrsolution.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
