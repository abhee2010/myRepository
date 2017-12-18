package com.util.dreamhome;

import java.util.Date;

import com.dreamhome.model.DreamHome;
import com.dreamhome.vo.DreamHomeVO;

public class ConversionUtility {
	public static DreamHomeVO modelToVOConversion(DreamHome dreamHome){
		DreamHomeVO dreamHomeVO = new DreamHomeVO();
		dreamHomeVO.setId(dreamHome.getId());
		dreamHomeVO.setBuildingName(dreamHome.getBuildingName());
		dreamHomeVO.setSellableArea(dreamHome.getSellableArea());
		dreamHomeVO.setCarpetArea(dreamHome.getCarpetArea());
		dreamHomeVO.setArea(dreamHome.getArea());
		dreamHomeVO.setTotalCost(dreamHome.getTotalCost());
		dreamHomeVO.setVisitDate(dreamHome.getVisitDate());
		dreamHomeVO.setLiked(dreamHome.getLiked());
		dreamHomeVO.setApproved(dreamHome.getApproved());
		return dreamHomeVO;
		
	}
	
	public static DreamHome voToModelConversion(DreamHomeVO dreamHomeVO){
		DreamHome dreamHome = new DreamHome();
		
		dreamHome.setId(dreamHomeVO.getId());
		dreamHome.setBuildingName(dreamHomeVO.getBuildingName());
		dreamHome.setSellableArea(dreamHomeVO.getSellableArea());
		dreamHome.setCarpetArea(dreamHomeVO.getCarpetArea());
		dreamHome.setArea(dreamHomeVO.getArea());
		dreamHome.setTotalCost(dreamHomeVO.getTotalCost());
		dreamHome.setVisitDate(dreamHomeVO.getVisitDate());
		dreamHome.setLiked(dreamHomeVO.getLiked());
		dreamHome.setApproved(dreamHomeVO.getApproved());
		return dreamHome;
		
	}
	public static DreamHomeVO setValues(String buildingName,float sellableArea,float carpetArea,long totalCost,String area,Date visitDate,boolean liked,String approved){
		DreamHomeVO dreamHomeVO = new DreamHomeVO();
		dreamHomeVO.setBuildingName(buildingName);
		dreamHomeVO.setSellableArea(sellableArea);
		dreamHomeVO.setCarpetArea(carpetArea);
		dreamHomeVO.setArea(area);
		dreamHomeVO.setTotalCost(totalCost);
		dreamHomeVO.setVisitDate(visitDate);
		dreamHomeVO.setLiked(liked);
		dreamHomeVO.setApproved(approved);
		return dreamHomeVO;
		
	}

}
