package blog.sb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.sb.dao.blogPostDao;
import blog.sb.model.blogPost;

@Controller
public class blogPostController {
	@Autowired
	private blogPostDao postDao;
	
	@RequestMapping("/createPost")
	@ResponseBody
	public String createPost(String blogName, String blogContent, 
			String blogOwner) {
		blogPost post = null;
		try {
			post = new blogPost(blogName, blogContent, blogOwner);
			postDao.save(post);
		} catch (Exception e) {
			return null;
		}
		return post.toString();
	}
	
	@RequestMapping("/getPost")
	@ResponseBody 
	public String getPost(String count) {
		String response = "[";
		List<blogPost> postList = null;
		int counter = 0;
		try {
			counter = Integer.parseInt(count);
		} catch (Exception e) {
			counter = 0;
		}
		postList = postDao.findAll();
		for (int i = counter; i < postList.size(); i ++) {
			response += postList.get(i).toString();
			if (i != (postList.size() - 1)) {
				response += ",";
			}
		}
		return response + "]";
	}
}