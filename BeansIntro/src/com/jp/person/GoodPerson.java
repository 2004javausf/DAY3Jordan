package com.jp.person;

public class GoodPerson {
	String name;
	String good_deed;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGood_deed() {
		return good_deed;
	}
	public void setGood_deed(String good_deed) {
		this.good_deed = good_deed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "GoodPerson [name=" + name + ", good_deed=" + good_deed + ", age=" + age + "]";
	}
	
	
}
