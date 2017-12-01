package com.swim.iservice;

import java.sql.SQLException;
import java.util.List;

import com.swim.domain.user;

public interface iuserservice {
	public user login(user u) throws ClassNotFoundException, SQLException;
	public user register(user u) throws ClassNotFoundException, SQLException;
	public user changeassword(user u) throws ClassNotFoundException, SQLException;
	public user changenfo(user u)throws ClassNotFoundException, SQLException;
	//public List<String> getallUserinformation(int uid)throws ClassNotFoundException, SQLException;
	//返回所有关注的课程
	public List<String> getallCoursebyuid(int uid) throws ClassNotFoundException, SQLException;
	
	

	

}
