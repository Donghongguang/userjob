package com.dong.findjob.entity;

import java.util.Date;

import javax.persistence.*;


import cn.afterturn.easypoi.excel.annotation.Excel;
@Entity
@Table(name="Person",schema = "findjob")
public class Person {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id" ,orderNum = "0")
	private int id;
	
	@Excel(name="姓名",orderNum = "1")
	private String username;
	@Excel(name="性别",orderNum = "2")
	private String sex;
	@Excel(name="生日", exportFormat = "yyyy-MM-dd", orderNum = "3" )
	private Date birthday;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public Person(int id, String username, String sex, Date birthday) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.birthday = birthday;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Person() {
		
	}
}
