package blog.sb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blogcomment")

public class blogComment {
    @Id
    private String id;

    private String blogName;
    private String blogComment;
    private String blogCommentOwner;

    public blogComment() {}
    public blogComment (String blogName, String blogComment, 
    		String blogCommentOwner) {
    	this.blogName = blogName;
    	this.blogComment = blogComment;
    	this.blogCommentOwner  = blogCommentOwner;
    }
    
    @Override
    public String toString() {
        return String.format(
                "{\"Content\" : \"%s\", \"Owner\" : \"%s\"}",
                blogComment, blogCommentOwner);
    }

}
