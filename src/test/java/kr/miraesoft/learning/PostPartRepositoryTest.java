package kr.miraesoft.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import kr.miraesoft.learning.entities.Post;
import kr.miraesoft.learning.entities.PostPart;
import kr.miraesoft.learning.repositories.PostPartRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
@Transactional
public class PostPartRepositoryTest {
	
	@Autowired
	PostPartRepository repository;
	
	@Test
	public void test() {
		PostPart postPart = new PostPart();
		String body = "Hello";
		postPart.setBody(body);
		
		repository.save(postPart);
		
		PostPart dbPostPart = repository.findOne(postPart.getPostPartId());
		assertNotNull(dbPostPart);
		assertEquals(body, dbPostPart.getBody());
	}
	
	@Test
	public void insertTest() {
		
		Post post = new Post();
		post.setPostDate(new Date());
		post.setTitle("First Post");
		
		PostPart postPart = new PostPart();
		String body = "Hello";
		postPart.setBody(body);
		
		postPart.setPost(post);
		
		repository.save(postPart);
		
		PostPart dbPostPart = repository.findOne(postPart.getPostPartId());
		assertNotNull(dbPostPart);
		assertNotNull(dbPostPart.getPost());
		assertEquals(body, dbPostPart.getBody());
	}
}
