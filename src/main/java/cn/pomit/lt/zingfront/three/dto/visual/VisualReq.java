package cn.pomit.lt.zingfront.three.dto.visual;

import javax.validation.constraints.NotEmpty;

public class VisualReq {
	private Integer id;
	private Integer type;
	@NotEmpty(message = "用户名不能为空!")
	private String userName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}

