package com.swim.domain;

public class Teacher {
	private int tid;//教师编号 
	private String teachername;//教师姓名
	private String teacherbrief;//教师简介
	private String teacherpassword;//教室账户密码 
	private String img;//教师头像地址
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getTeacherbrief() {
		return teacherbrief;
	}
	public void setTeacherbrief(String teacherbrief) {
		this.teacherbrief = teacherbrief;
	}
	public String getTeacherpassword() {
		return teacherpassword;
	}
	public void setTeacherpassword(String teacherpassword) {
		this.teacherpassword = teacherpassword;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
