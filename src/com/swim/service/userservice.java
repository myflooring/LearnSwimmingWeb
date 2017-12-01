package com.swim.service;

import java.sql.SQLException;
import java.util.List;

import com.swim.dao.impl.userdao;
import com.swim.domain.user;
import com.swim.idao.iuserdao;
import com.swim.iservice.iuserservice;

public class userservice implements iuserservice{
	private iuserdao ud= new userdao();
	@Override
	public user login(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		user realuser=ud.login(u);
		return realuser;
	}

	@Override
	public user register(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		user realuser=ud.register(u);
		return realuser;
		
	}

	@Override
	public user changeassword(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return ud.changeassword(u);
	}

	@Override
	public user changenfo(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return ud.changenfo(u);
	}

	/*@Override
	public List<String> getallUserinformation(int uid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return ud.getallUserinformation(uid);
	}
	 */
	@Override
	public List<String> getallCoursebyuid(int uid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return ud.getallCoursebyuid(uid);
	}

	

}
