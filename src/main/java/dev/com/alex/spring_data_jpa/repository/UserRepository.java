package dev.com.alex.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.com.alex.spring_data_jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
