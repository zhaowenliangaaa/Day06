package cn.jiyun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiyun.mapper.UserMapper;
import cn.jiyun.pojo.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper um;
	
	public User login(User u) {
		return um.login(u);
	}

	public void regist(User u) {
		um.regist(u);
		
	}
	
	public Integer nameIsHave(String username) {
		return um.nameIsHave(username);
	}

}
