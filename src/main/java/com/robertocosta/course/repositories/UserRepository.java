package com.robertocosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertocosta.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
