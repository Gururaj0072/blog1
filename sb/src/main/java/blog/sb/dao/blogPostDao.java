package blog.sb.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import blog.sb.model.blogPost;

public interface blogPostDao extends MongoRepository<blogPost, String> {
	public List<blogPost> findByBlogName(String blogName);
}
