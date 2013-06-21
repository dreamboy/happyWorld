package kr.miraesoft.learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import kr.miraesoft.learning.entities.Comment;
import kr.miraesoft.learning.entities.Post;
import kr.miraesoft.learning.repositories.CommentRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
@Transactional
public class CommentRepositoryTest {
	
	@Autowired
	CommentRepository repository;
	
	@Test
	public void insertTest() {
		Post post = new Post();
		post.setPostDate(new Date());
		post.setTitle("This is a tutorial on One to Many Relationships");
		
		final String author="Kevin Bowersox";
		final String body = "This is a small commnet";
		Comment comment = new Comment();
		
		comment.setAuthor(author);
		comment.setBody(body);
		comment.setPost(post);
		
		repository.save(comment);
		
		Comment dbComment = repository.findOne(comment.getCommentId());
		assertNotNull(dbComment);
		assertNotNull(dbComment.getPost());
		assertEquals(author, dbComment.getAuthor());
		assertEquals(body, dbComment.getBody());
		
	}

}
