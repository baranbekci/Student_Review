package com.baran.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // oto sayý vermek için
	private int stuId;
	@Column
	private String stuName;
	@Column
	private String stuSurname;
	@Column
	private int stuPhone;
	@Column
	private String stuCity;
	@Column
	private String stuDistrict;
	@Column
	private String stuDescription;
	public Student() {}
	public Student(int stuId, String stuName, String stuSurname, int stuPhone, String stuCity, String stuDistrict,
			String stuDescription) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuSurname = stuSurname;
		this.stuPhone = stuPhone;
		this.stuCity = stuCity;
		this.stuDistrict = stuDistrict;
		this.stuDescription = stuDescription;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSurname() {
		return stuSurname;
	}
	public void setStuSurname(String stuSurname) {
		this.stuSurname = stuSurname;
	}
	public int getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(int stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	public String getStuDistrict() {
		return stuDistrict;
	}
	public void setStuDistrict(String stuDistrict) {
		this.stuDistrict = stuDistrict;
	}
	public String getStuDescription() {
		return stuDescription;
	}
	public void setStuDescription(String stuDescription) {
		this.stuDescription = stuDescription;
	}
	
}
