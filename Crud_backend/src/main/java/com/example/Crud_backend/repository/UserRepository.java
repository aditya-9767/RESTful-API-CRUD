package com.example.Crud_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Crud_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
