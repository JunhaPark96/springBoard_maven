package kr.ac.kopo.form;

public class MemberVO {
	String id;
	String passwd;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public MemberVO(String id, String passwd) {
		super();
		this.id = id;
		this.passwd = passwd;
	}
	public MemberVO() {
		super();
	}
	
	
}
