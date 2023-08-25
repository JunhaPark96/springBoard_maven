package kr.ac.kopo.board.vo;

import javax.validation.constraints.NotEmpty;

public class LoginVO {
	@NotEmpty(message = "id: 필수항목")
	private String id;
	@NotEmpty(message = "password: 필수항목")
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
