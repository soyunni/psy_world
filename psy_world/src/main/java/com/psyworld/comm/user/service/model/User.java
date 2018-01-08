package com.psyworld.comm.user.service.model;

import java.util.Date;

public class User {
	
	//ID
	private String userId = "";
	//Password
	private String userPassword = "";
	
	//사용자 이름
	private String userNm = "";
	//사용자 닉네임
	private String userNick = "";
	//이메일
	private String userEmail = "";
	//핸드폰
	private String userPhone = "";
	//프로필 사진
	private String userImg = "";
	//프로필 사진 시스템 파일
	private String userImgSysFile = "";
	//썸네일 사진 
	private String thumnailImg = "";
	
	//기타 1
	private String etc01 = "";
	//기타 2
	private String etc02 = "";
	//기타 3
	private String etc03 = "";
	
	//사용자 IP
	private String userIp = "";
	//사용자 마지막 로그인
	private Date lastLogin = new Date();

	//등록일자 
	private Date regDate = new Date();
	//수정일자
	private Date modDate = new Date();
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public String getUserImgSysFile() {
		return userImgSysFile;
	}
	public void setUserImgSysFile(String userImgSysFile) {
		this.userImgSysFile = userImgSysFile;
	}
	public String getThumnailImg() {
		return thumnailImg;
	}
	public void setThumnailImg(String thumnailImg) {
		this.thumnailImg = thumnailImg;
	}
	public String getEtc01() {
		return etc01;
	}
	public void setEtc01(String etc01) {
		this.etc01 = etc01;
	}
	public String getEtc02() {
		return etc02;
	}
	public void setEtc02(String etc02) {
		this.etc02 = etc02;
	}
	public String getEtc03() {
		return etc03;
	}
	public void setEtc03(String etc03) {
		this.etc03 = etc03;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", userNm=" + userNm + ", userNick="
				+ userNick + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userImg=" + userImg
				+ ", userImgSysFile=" + userImgSysFile + ", thumnailImg=" + thumnailImg + ", etc01=" + etc01
				+ ", etc02=" + etc02 + ", etc03=" + etc03 + ", userIp=" + userIp + ", lastLogin=" + lastLogin
				+ ", regDate=" + regDate + ", modDate=" + modDate + "]";
	}
	
}
