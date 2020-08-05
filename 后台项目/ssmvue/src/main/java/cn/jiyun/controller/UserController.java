package cn.jiyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;

@RestController
@CrossOrigin(origins = { "http://localhost:63342" })
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping("/login")
	public User login(@RequestBody User u) {
		 User lu=us.login(u);
		 return lu;
	}
	
	@RequestMapping("/regist")
	public void registUser(@RequestBody User u) {
		us.regist(u);
	}
	
	@RequestMapping("/nameishave")
	public Integer nameIsHave(String username) {
		return us.nameIsHave(username);
	}

}
