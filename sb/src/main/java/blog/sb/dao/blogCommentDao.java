package blog.sb.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import blog.sb.model.blogComment;

public interface blogCommentDao extends MongoRepository<blogComment, String> {
	public List<blogComment> findByBlogName(String blogName);
}
