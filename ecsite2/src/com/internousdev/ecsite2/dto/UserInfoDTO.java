package com.internousdev.ecsite2.dto;

public class UserInfoDTO {
	private String id;
	private String userName;
	private String userPassword;
	private String insert_date;

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}

	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserPassword(){
		return userPassword;
	}
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}

	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

}
