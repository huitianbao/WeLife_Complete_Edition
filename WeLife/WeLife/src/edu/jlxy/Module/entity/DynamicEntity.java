package edu.jlxy.Module.entity;

public class DynamicEntity {
	private String did;
	private String title;
	private String content;
	private String photoURL;
	private static final DynamicEntity DYNAMIC_ENTITY=new DynamicEntity();

	public String getdid() {
		return did;
	}

//	public void setdid(String did) {
//		this.did = did;
//	}

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

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	

	public void setAllInfo( String title, String content, String photoURL) {

		setTitle(title);
		setContent(content);
		setPhotoURL(photoURL);
		
	}
	public static DynamicEntity getInstance(){
		return DYNAMIC_ENTITY;
	}

}
