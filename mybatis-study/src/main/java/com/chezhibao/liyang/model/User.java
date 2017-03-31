package com.chezhibao.liyang.model;

import java.util.Date;

public class User {

	private String name;
	private int age;
	private int mobile;
	private Date birthday;

	public User() {
		super();
	}

	public User(String name, int age, int mobile, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", mobile=" + mobile + ", birthday=" + birthday + "]";
	}

}
