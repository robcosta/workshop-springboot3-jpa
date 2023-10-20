package com.robertocosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertocosta.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
