package com.jbedu.board.dto;

import java.sql.Timestamp;

public class BoardDto {

	private int bnum;  //게시판 글번호
	private String bname; //글쓴이
	private String btitle; //게시판 글제목
	private String bcontent; //게시판 글내용
	private Timestamp bdate; // 글쓴 날짜와 시간(날짜 타입 선언)
	private int bhit;// 글 조회수 
	
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BoardDto(int bnum, String bname, String btitle, String bcontent, Timestamp bdate, int bhit) {
		super();
		this.bnum = bnum;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	
	
	
}
