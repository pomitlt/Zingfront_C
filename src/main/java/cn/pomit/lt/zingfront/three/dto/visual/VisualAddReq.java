package cn.pomit.lt.zingfront.three.dto.visual;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class VisualAddReq {
	@NotEmpty(message = "标题不能为空!")
	private String caption;
	@NotEmpty(message = "描述不能为空!")
	private String description;
	
	@NotEmpty(message = "用户名不能为空!")
	private String userName;
	
	@NotNull(message = "封面不能为空!")
	private Long cover;
	
	@NotNull(message = "全景图不能为空!")
	private Long panorama;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCover() {
		return cover;
	}
	public void setCover(Long cover) {
		this.cover = cover;
	}
	public Long getPanorama() {
		return panorama;
	}
	public void setPanorama(Long panorama) {
		this.panorama = panorama;
	}
	
}

