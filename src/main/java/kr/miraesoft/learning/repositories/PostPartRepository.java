package kr.miraesoft.learning.repositories;

import kr.miraesoft.learning.entities.PostPart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostPartRepository extends JpaRepository<PostPart, Integer> {

}
