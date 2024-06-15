package dev.com.alex.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.com.alex.spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    //Query Method
    List<User> findByNameContaining(String name);

    //Query Method
    User findByUsername(String username);

    //Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filterByName(@Param("name") String name);


}
