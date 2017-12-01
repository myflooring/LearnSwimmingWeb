package com.swim.domain;
/**
 * 课程总表
 * @author Chan
 *
 */
public class CourseTotal { 
	private int ctid;//课程主键
	private String ctname;//课程名
	private int tid;//课程教师编号
	private String studentnumber;//课程已经参与的学生数目
	private String ctbrief;//课程简介
	private String img;//课程封面
	
	public int getCtid() {
		return ctid;
	}
	public void setCtid(int ctid) {
		this.ctid = ctid;
	}
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getStudentnumber() {
		return studentnumber;
	}
	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}
	public String getCtbrief() {
		return ctbrief;
	}
	public void setCtbrief(String ctbrief) {
		this.ctbrief = ctbrief;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

}
