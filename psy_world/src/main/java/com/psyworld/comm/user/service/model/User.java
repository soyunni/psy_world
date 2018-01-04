package com.psyworld.comm.user.service.model;

import java.util.Date;

import javax.xml.crypto.Data;

public class User {
	
	//ID
	private String userId = "";
	
	//Password
	private String userPassword = "";

	//사용자 이름
	private String userNm = "";
	
	//사용자 IP
	private String userIp = "";
	
	//사용자 마지막 로그인
	private Date lastLogin = new Date();

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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", userNm=" + userNm + ", userIp=" + userIp
				+ ", lastLogin=" + lastLogin + "]";
	}
	
	
}
