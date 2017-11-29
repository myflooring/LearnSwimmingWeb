package com.swim.iservice;

import java.sql.SQLException;
import java.util.List;

import com.swim.domain.course;
import com.swim.domain.courseprogress;
import com.swim.domain.coursetotal;

public interface icourseservice {
	//订阅课程
	public List<coursetotal> subscribeCoursebyuser(int uid,int ctid) throws SQLException, ClassNotFoundException;
	//记录学习进度
	public List<courseprogress> learnCoursebyuser(int uid,int ctid,int chid) throws SQLException, ClassNotFoundException;
	//对于新用户课程的展示
	public List<coursetotal> showCoursebynewuser(int uid,int ctid)throws SQLException,ClassNotFoundException;
	//对于已经学习过这个课程的用户的展示
	public List<coursetotal> showCoursebyolduser(int uid,int ctid)throws SQLException,ClassNotFoundException;
	//展现具体课程章节
	public List<course> showCourseChapter(int ctid)throws SQLException,ClassNotFoundException;
}
