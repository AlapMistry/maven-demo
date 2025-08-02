package com.alap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alap.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
