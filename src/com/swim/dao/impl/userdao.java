package com.swim.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.swim.domain.user;
import com.swim.idao.iuserdao;

public class userdao implements iuserdao {

	@Override
	public user login(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		user realuser=null;
		
		return realuser;
	}

	@Override
	public user register(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user changeassword(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user changenfo(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getallUserinformation(int uid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getallCoursebyuid(int uid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
