package com.swim.domain;
/**
 * 课程总表
 * @author Chan
 *
 */
public class coursetotal { 
	private int ctid;//课程主键
	private String ctname;//课程名
	private String teachername;//课程教师名
	private String studentnumber;//课程已经参与的学生数目
	private String ctbrief;//课程简介
	private String img;//课程封面
	
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
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
