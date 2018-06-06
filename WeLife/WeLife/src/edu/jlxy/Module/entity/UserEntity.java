package edu.jlxy.Module.entity;


public class UserEntity {
	private String uid1;
	private String uid2;//这个uid2用于在修改uid的情况下，存储原本的uid，以便可以在数据库中查询到你要修改的uid
	private String pwd;
	private String name;
	private int age;
	private String job;
	private static final UserEntity USER_ENTITY=new UserEntity();
	public String getuid1() {
		return uid1;
	}

	public void setuid1(String uid1) {
		this.uid1 = uid1;
	}
	
	public String getuid2() {
		return uid2;
	}

	public void setuid2(String uid2) {
		this.uid2 = uid2;
	}

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getjob() {
		return job;
	}

	public void setjob(String job) {
		this.job = job;
	}

	public void setUserInfo(String uid1,String uid2, String pwd, String name, int age, String job) {
		setuid1(uid1);
		setuid2(uid2);
		setpwd(pwd);
		setname(name);
		setAge(age);
		setjob(job);
	}
	public static UserEntity getInstance(){
		return USER_ENTITY;
	}
	

}
