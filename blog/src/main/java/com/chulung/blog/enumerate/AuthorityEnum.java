package com.chulung.blog.enumerate;

public enum AuthorityEnum {
	/**超级管理员*/
	SUPERbackend(0, "超级管理员"),
	/**游客*/
	VISITOR(1,"游客"),
	/**普通用户*/
	COMMON_USER(2,"普通用户");
	private Integer code;
	private String dedcription;
	private AuthorityEnum(Integer code, String dedcription) {
		this.code = code;
		this.dedcription = dedcription;
	}
	public Integer getCode() {
		return code;
	}
	public String getDedcription() {
		return dedcription;
	}
	
}
