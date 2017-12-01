package com.swim.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.swim.database.DatabaseConnection;
import com.swim.domain.user;
import com.swim.idao.iuserdao;

public class userdao implements iuserdao {
	private DatabaseConnection defaultConnection=new DatabaseConnection();


	@Override
	public user login(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		user realuser=new user();
		try(Connection conn=defaultConnection.openConnection()){
			String userid=u.getUserid();
			String userpassword=u.getUserpassword();
			String sql="SELECT * FROM user WHERE userid=?";
			PreparedStatement pt=conn.prepareStatement(sql);
			pt.setString(1, userid);
			ResultSet rs=pt.executeQuery();
			if(!rs.next()) {
				String selectpassword=rs.getString("userpassword");
				if(userpassword.equals(selectpassword)) {
					realuser.setUid(rs.getInt("uid"));
					realuser.setUsername(rs.getString("username"));
					realuser.setUserpassword(selectpassword);
					realuser.setUserid(userid);
					realuser.setTele(rs.getString("tele"));
					realuser.setImg(rs.getString("img"));
					realuser.setEmail(rs.getString("email"));
					realuser.setEducation(rs.getString("education"));
					realuser.setContent(rs.getString("content"));
					return realuser;
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	
	}

	@Override
	public user register(user u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		user realuser=new user();
		
		
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

	/*@Override
	public List<String> getallUserinformation(int uid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	 */
	@Override
	public List<String> getallCoursebyuid(int uid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
