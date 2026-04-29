package com.AlfaazCraftApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AlfaazCraftApp.entity.Post;

public interface PostRepository extends JpaRepository<Post,Long> {
}
