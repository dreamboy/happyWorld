package kr.miraesoft.happyWorld;

import kr.miraesoft.happyWorld.repositories.PostRepository;
import kr.miraesoft.learning.entities.Post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/happy-world-test-context.xml")
@Transactional
public class PostRepositoryTest {
	
	@Autowired
	PostRepository repository;
	
	@Test
	public void test() {
		
		Post post = new Post();
		
	}

}