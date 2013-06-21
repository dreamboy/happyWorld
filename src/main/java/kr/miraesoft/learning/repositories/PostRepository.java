package kr.miraesoft.learning.repositories;


import kr.miraesoft.learning.entities.Post;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Integer> {

}