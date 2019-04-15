package cn.pomit.lt.zingfront.three.dto.visual;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class VisualMarkerReq {
	@NotNull(message = "全景图不能为空!")
	private Integer visualId;
	@NotNull(message = "markId不能为空!")
	private String markId;
	@NotNull(message = "经度不能为空!")
	private Double longitude;
	@NotNull(message = "纬度不能为空!")
	private Double latitude;
	@NotEmpty(message = "提示不能为空!")
	private String tooltip;
	@NotEmpty(message = "描述不能为空!")
	private String content;
	private int type = 0;
	@NotEmpty(message = "用户名不能为空!")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getVisualId() {
		return visualId;
	}

	public void setVisualId(Integer visualId) {
		this.visualId = visualId;
	}

	public String getMarkId() {
		return markId;
	}

	public void setMarkId(String markId) {
		this.markId = markId;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
