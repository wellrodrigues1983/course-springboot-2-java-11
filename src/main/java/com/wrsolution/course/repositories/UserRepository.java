package com.wrsolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrsolution.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
