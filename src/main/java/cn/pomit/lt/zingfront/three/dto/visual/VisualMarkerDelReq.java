package cn.pomit.lt.zingfront.three.dto.visual;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class VisualMarkerDelReq {
	@NotNull(message = "markId不能为空!")
	private String markId;
	@NotEmpty(message = "用户名不能为空!")
	private String userName;
	
	public String getMarkId() {
		return markId;
	}
	public void setMarkId(String markId) {
		this.markId = markId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}

