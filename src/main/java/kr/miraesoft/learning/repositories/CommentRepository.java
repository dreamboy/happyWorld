package kr.miraesoft.learning.repositories;

import kr.miraesoft.learning.entities.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
