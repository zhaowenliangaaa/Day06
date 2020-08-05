package cn.jiyun.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.jiyun.pojo.User;

public interface UserMapper {
	
	@Select("select * from user where username=#{username} and password=#{password}")
	public User login(User u);

	@Insert("insert into user(username,password) values(#{username},#{password})")
	public void regist(User u);
	
	@Select("select count(*) from user where username = #{username}")
	public Integer nameIsHave(String username);

}
