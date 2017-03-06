package blog.sb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blogpost")
public class blogPost {
    @Id
    public String id;

    public String blogName;
    public String blogOwner;
    public String blogContent;
    
    public blogPost() { }
    
    public blogPost(String blogName, String blogContent,
    		String blogOwner) {
    	this.blogName = blogName;
    	this.blogContent = blogContent;
    	this.blogOwner = blogOwner;
    }
    
    @Override
    /*
    public String toString() {
        return String.format(
                "Customer[id=%s, Name='%s', Content='%s' Owner='%s']",
                id, blogName, blogContent, blogOwner);
    }
    */
	public String toString() {
		String response = null;
		response = "{\"title\":\"" + blogName + "\", \"content\":"
				+ "\"" + blogContent + "\", \"owner\":\"" + blogOwner + "\"}";
		return response;
	}
	

}
