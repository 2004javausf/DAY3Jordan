package com.jp.person;

public class BadPerson {
	String name;
	String bad_deed;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBad_deed() {
		return bad_deed;
	}
	public void setBad_deed(String bad_deed) {
		this.bad_deed = bad_deed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "BadPerson [name=" + name + ", bad_deed=" + bad_deed + ", age=" + age + "]";
	}
	
	
}
