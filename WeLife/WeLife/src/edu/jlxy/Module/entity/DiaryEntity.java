package edu.jlxy.Module.entity;

public class DiaryEntity {
	private String did;
	
	private String userId;
	private String title;
	private String content;
	private String date;
	private String permission;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	 public void set_without_diaLd_without_permission(String userId, String title, String content, String date) {

	        this.userId = userId;
	        this.title = title;
	        this.content = content;
	        this.date = date;
	        
	    }

	public String getDiaId() {
		// TODO 自动生成的方法存根
		return did;
	}
	public void setDiaId(String did){
		this.did=did;
	}

}
