package com.css.driver.provider.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Driver implements Serializable{
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -2259974552350170769L;
	private Integer id;
	private String name;
	private String sex;
	private String num;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createDate;
	
	private Integer shengid;
	private Integer shiid;
	private Integer quid;
	
	
	private String shengName;
	private String shiName;
	private String quName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getShengid() {
		return shengid;
	}
	public void setShengid(Integer shengid) {
		this.shengid = shengid;
	}
	public Integer getShiid() {
		return shiid;
	}
	public void setShiid(Integer shiid) {
		this.shiid = shiid;
	}
	public Integer getQuid() {
		return quid;
	}
	public void setQuid(Integer quid) {
		this.quid = quid;
	}
	public String getShengName() {
		return shengName;
	}
	public void setShengName(String shengName) {
		this.shengName = shengName;
	}
	public String getShiName() {
		return shiName;
	}
	public void setShiName(String shiName) {
		this.shiName = shiName;
	}
	public String getQuName() {
		return quName;
	}
	public void setQuName(String quName) {
		this.quName = quName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		result = prime * result + ((quName == null) ? 0 : quName.hashCode());
		result = prime * result + ((quid == null) ? 0 : quid.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((shengName == null) ? 0 : shengName.hashCode());
		result = prime * result + ((shengid == null) ? 0 : shengid.hashCode());
		result = prime * result + ((shiName == null) ? 0 : shiName.hashCode());
		result = prime * result + ((shiid == null) ? 0 : shiid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		if (quName == null) {
			if (other.quName != null)
				return false;
		} else if (!quName.equals(other.quName))
			return false;
		if (quid == null) {
			if (other.quid != null)
				return false;
		} else if (!quid.equals(other.quid))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (shengName == null) {
			if (other.shengName != null)
				return false;
		} else if (!shengName.equals(other.shengName))
			return false;
		if (shengid == null) {
			if (other.shengid != null)
				return false;
		} else if (!shengid.equals(other.shengid))
			return false;
		if (shiName == null) {
			if (other.shiName != null)
				return false;
		} else if (!shiName.equals(other.shiName))
			return false;
		if (shiid == null) {
			if (other.shiid != null)
				return false;
		} else if (!shiid.equals(other.shiid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", sex=" + sex + ", num=" + num + ", createDate=" + createDate
				+ ", shengid=" + shengid + ", shiid=" + shiid + ", quid=" + quid + ", shengName=" + shengName
				+ ", shiName=" + shiName + ", quName=" + quName + "]";
	}
	
	

	
	

}
