package com.swim.database;
/** 
 *Connection to DBS Util
 */
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DatabaseConnection {
	private Connection con;
	
	private static final String url="jdbc:mysql://localhost:3306/Swimming?useSSL=false&"
			+ "useUnicode=true&characterEncoding=utf-8";
	//用户名
	private static final String username="root";
	//数据库登录密码
	private static final String password="Flowerrui";
	static {
		try {
			//加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			//打印异常
			e.printStackTrace();
		}
	}
	//定义一个方法连接数据库
	public Connection openConnection()throws Exception{
		 con= (Connection) DriverManager.getConnection(url, username, password);
		 return con;
	}
	
}
