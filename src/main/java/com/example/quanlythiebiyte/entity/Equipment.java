package com.example.quanlythiebiyte.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long equipmentID;
	@Column(nullable = true)
	private String equipmentName;
	@Column(nullable = true)
	private Date date;
	@Column(nullable = true)
	private String image;
	@Column(nullable = true)
	private Boolean isActive;
	
	public long getEquipmentID() {
		return equipmentID;
	}
	public void setEquipmentID(long equipmentID) {
		this.equipmentID = equipmentID;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
