package com.lyscharlie.biz.core.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lys_user")
public class UserDO {

	/**
	 * 用户id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	/**
	 * 用户名
	 */
	@Column
	private String userName;
	/**
	 * 用户密码
	 */
	@Column
	private String password;
	/**
	 * 邮箱
	 */
	@Column
	private String email;
	/**
	 * 手机号
	 */
	@Column
	private String mobile;
	/**
	 * 推荐人id
	 */
	@Column
	private Long registerReferId;
	/**
	 * 最近一次登录时间
	 */
	@Column
	private Date lastLoginTime;
	/**
	 * 创建时间
	 */
	@Column
	private Date gmtCreate;
	/**
	 * 最后修改时间
	 */
	@Column
	private Date gmtModified;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getRegisterReferId() {
		return registerReferId;
	}

	public void setRegisterReferId(Long registerReferId) {
		this.registerReferId = registerReferId;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "UserDO [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email + ", mobile=" + mobile + ", registerReferId=" + registerReferId
				+ ", lastLoginTime=" + lastLoginTime + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + "]";
	}

}
