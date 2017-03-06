package blog.sb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.sb.dao.blogCommentDao;
import blog.sb.model.blogComment;

@Controller
public class blogCommentController {
	@Autowired
	blogCommentDao commentDao;
	
	@RequestMapping("/createComment")
	@ResponseBody
	public String createComment(String blogName, 
			String blogComment, String blogCommentOwner) {
		blogComment comment = null;
		try {
			comment = new blogComment(blogName, blogComment, 
					blogCommentOwner);
			commentDao.save(comment);
		} catch (Exception e) {
			return null;
		}
		return "OK";
	}
	@RequestMapping("/getComments")
	@ResponseBody
	public String getComments(String blogName) {
		String response = "";
		List<blogComment> commentList = null;
		
		commentList = commentDao.findByBlogName(blogName);
		
		for (int i = 0; i < commentList.size(); i ++) {
			response += commentList.get(i).toString();
			if (i != (commentList.size() - 1)) {
				response += ",";
			}
		}
		return response;
	}
}
