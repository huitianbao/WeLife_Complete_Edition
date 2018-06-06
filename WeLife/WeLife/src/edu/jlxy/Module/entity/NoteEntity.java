package edu.jlxy.Module.entity;


public class NoteEntity {
	
	private String content;
	private String nid;
	private static final NoteEntity NOTE_ENTITY=new NoteEntity();

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getnid() {
		return nid;
	}

	public void setnid(String nid) {
		this.nid = nid;
	}
	public static NoteEntity getInstance(){
		return NOTE_ENTITY;
	}
	



}
