package com.robertocosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertocosta.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
