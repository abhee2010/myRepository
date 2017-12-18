package com.dreamhome.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class DreamHome {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="id")
	private int id;
	
	@Column(name ="buildingName")
	private String buildingName;
	
	@Column(name ="sellabeArea")
	private float sellableArea;
	
	@Column(name ="carpetArea")
	private float carpetArea;
	
	@Column(name ="totalCost")
	private long totalCost;
	
	@Column(name="area")
	private String area;
	
	@Column(name ="visitDate")
	private Date visitDate;
	
	@Column(name ="liked")
	private boolean liked;
	
	@Column(name ="approved")
	private String approved;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public float getSellableArea() {
		return sellableArea;
	}

	public void setSellableArea(float sellableArea) {
		this.sellableArea = sellableArea;
	}

	public float getCarpetArea() {
		return carpetArea;
	}

	public void setCarpetArea(float carpetArea) {
		this.carpetArea = carpetArea;
	}

	public long getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(long totalCost) {
		this.totalCost = totalCost;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public boolean getLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}
	

}
