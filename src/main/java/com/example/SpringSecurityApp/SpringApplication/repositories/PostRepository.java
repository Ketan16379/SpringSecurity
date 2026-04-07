package com.example.SpringSecurityApp.SpringApplication.repositories;


import com.example.SpringSecurityApp.SpringApplication.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long>{
}