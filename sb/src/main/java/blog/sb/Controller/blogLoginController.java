package blog.sb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.sb.dao.blogLoginDao;
import blog.sb.model.blogLogin;

@Controller
public class blogLoginController {
	@Autowired
	private blogLoginDao loginDao;
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(String name, 
			String userName, String userPassword,
			String email, String phNumber) {
		blogLogin login = null;
		try {
			login = new blogLogin(name, userName,
					userPassword, email, phNumber);
			loginDao.save(login);
		} catch (Exception e) {
			return null;
		}
		return "{\"token\":\"" + login.getUserName() + "\"}";
	}
	@RequestMapping("loginValidate")
	@ResponseBody
	public String loginValidate(String email, String userPassword) {
		blogLogin login = null;
		try {
			login = loginDao.findByEmail(email);
			if (!userPassword.equals(login.getUserPassword())) {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
		return "{\"token\":\"" + login.getUserName() + "\"}";
	}
}
