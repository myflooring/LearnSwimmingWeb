package com.swim.domain;
/**
 * 课程具体章节表
 * @author Chan
 *
 */
public class Course {
	private int ctid;//课程主键
	private int chid;//课程章节编号
	private String ctname;//章节名
	private String ctbrief;//章节简介
	private String cttime;//章节时长
	
	private String videourl;//课程视频地址
	public int getCtid() {
		return ctid;
	}
	public void setCtid(int ctid) {
		this.ctid = ctid;
	}
	public int getChid() {
		return chid;
	}
	public void setChid(int chid) {
		this.chid = chid;
	}
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	public String getVideourl() {
		return videourl;
	}
	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}
	public String getCtbrief() {
		return ctbrief;
	}
	public void setCtbrief(String ctbrief) {
		this.ctbrief = ctbrief;
	}
	public String getCttime() {
		return cttime;
	}
	public void setCttime(String cttime) {
		this.cttime = cttime;
	}
	
}
