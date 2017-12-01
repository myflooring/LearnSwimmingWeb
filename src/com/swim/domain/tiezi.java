package com.swim.domain;

public class Tiezi {
	private int tid;//帖子的编号 
	private int uid; 
	private String tdate;//发帖时间 
	private String content;//帖子的内容 
	private String theme;//帖子的主题 
	private int themetie;//是否是主题贴 0不是，1是 
	private int huitienum;//回帖数，评判热度
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public int getThemetie() {
		return themetie;
	}
	public void setThemetie(int themetie) {
		this.themetie = themetie;
	}
	public int getHuitienum() {
		return huitienum;
	}
	public void setHuitienum(int huitienum) {
		this.huitienum = huitienum;
	}
	

}
