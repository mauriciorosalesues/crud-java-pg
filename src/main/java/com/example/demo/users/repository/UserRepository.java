package com.example.demo.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.users.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
