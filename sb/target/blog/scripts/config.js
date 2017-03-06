function config () {
    this.dns = "http://localhost:8080";
    this.query_login = "/blog/loginValidate?";
    this.query_api_token_key = "/api-token-key";
    this.sign_up = "/sign-up/";
    this.user_create = "/blog/create?";
    this.blog_get = "/blog/getPost/";
    this.blog_create = "/blog/createPost?"
    this.get_query_login = function() {
        return this.dns + this.query_login;
    };
    this.get_login = function (username, userPassword) {
    	return this.dns + this.query_login + "email=" + username + "&userPassword=" + userPassword;
    }
    this.get_user_create = function (username, userPassword, name, email, phNumber) {
    	return this.dns + this.user_create + "name=" + name + "&userName=" + username + "&userPassword=" + userPassword + "&email=" + email + "&phNumber=" + phNumber;
    }
    this.create_blog = function(blogName, blogContent, userName) {
    	return this.dns + this.blog_create + "blogName=" + blogName + "&blogContent=" + blogContent + "&blogOwner=" + userName;
    }
    this.get_blogs = function() {
    	return this.dns + this.blog_get;
    }
};

