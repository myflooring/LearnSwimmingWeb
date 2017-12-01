package com.swim.domain;

public class Article {
	private int aid;//文章编号 
	private String adate;//文章发表时间 
	private String author;//文章作者 
	private int Clicknum; //文章点击数
	private String content; //文章原文
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getClicknum() {
		return Clicknum;
	}
	public void setClicknum(int clicknum) {
		Clicknum = clicknum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
