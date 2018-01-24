package com.ps.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Hatch {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long quantity;
	
	private Calendar startSettingDate;
	
	private Calendar endSettingDate;
	
	private Calendar startHatchingDate;
	
	private Calendar endHatchingDate;
	
	private Long brocken;
	
	private Long infertileCount;
	
	private Long deadCount;
	
	@Transient
	private Long gradeACount;
	
	private Long gradeBCount;
	
	private Breed breed;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Calendar getStartSettingDate() {
		return startSettingDate;
	}
	public void setStartSettingDate(Calendar startSettingDate) {
		this.startSettingDate = startSettingDate;
	}
	public Calendar getEndSettingDate() {
		return endSettingDate;
	}
	public void setEndSettingDate(Calendar endSettingDate) {
		this.endSettingDate = endSettingDate;
	}
	public Calendar getStartHatchingDate() {
		return startHatchingDate;
	}
	public void setStartHatchingDate(Calendar startHatchingDate) {
		this.startHatchingDate = startHatchingDate;
	}
	public Calendar getEndHatchingDate() {
		return endHatchingDate;
	}
	public void setEndHatchingDate(Calendar endHatchingDate) {
		this.endHatchingDate = endHatchingDate;
	}
	public Long getBrocken() {
		return brocken;
	}
	public void setBrocken(Long brocken) {
		this.brocken = brocken;
	}
	public Long getInfertileCount() {
		return infertileCount;
	}
	public void setInfertileCount(Long infertileCount) {
		this.infertileCount = infertileCount;
	}
	public Long getDeadCount() {
		return deadCount;
	}
	public void setDeadCount(Long deadCount) {
		this.deadCount = deadCount;
	}
	public Long getGradeACount() {
		return gradeACount;
	}
	public void setGradeACount(Long gradeACount) {
		this.gradeACount = gradeACount;
	}
	public Long getGradeBCount() {
		return gradeBCount;
	}
	public void setGradeBCount(Long gradeBCount) {
		this.gradeBCount = gradeBCount;
	}
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	

}
