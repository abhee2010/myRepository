package com.dreamhome.vo;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class DreamHomeVO {
	private int id;
	private String buildingName;
	
	private float sellableArea;
	
	private float carpetArea;
	
	private long totalCost;
	
	private String area;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date visitDate;
	
	private boolean liked;
	
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

	public void setTotalCost(long l) {
		this.totalCost = l;
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

	@Override
	public String toString() {
		return "DreamHomeVO [buildingName=" + buildingName + ", sellableArea="
				+ sellableArea + ", carpetArea=" + carpetArea + ", totalCost="
				+ totalCost + ", area=" + area + ", visitDate=" + visitDate
				+ ", liked=" + liked + ", approved=" + approved + "]";
	}


}
