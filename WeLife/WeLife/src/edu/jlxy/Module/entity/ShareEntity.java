package edu.jlxy.Module.entity;

import java.sql.Date;

public class ShareEntity {
	private String uid;
	private String did;
	private Date date;
	private static final ShareEntity SHARE_ENTITY=new ShareEntity();
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getDid() {
		return did;
	}
//	public void setDid(String did) {
//		this.did = did;
//	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setAllInfo(String uid,Date date2){
		setUid(uid);
		setDate(date2);
	}
	public static ShareEntity getInstance(){
		return SHARE_ENTITY;
	}
}
