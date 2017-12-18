package com.dreamhome.dao;

import java.util.List;

import com.dreamhome.vo.DreamHomeVO;

public interface DreamHomeDao {
	
	public DreamHomeVO getProjectDetailsByBuildingName(String buildingName);

	public List<DreamHomeVO> getProjectList();

	public void addProject(DreamHomeVO dreamHomeVO);

	public void deleteProject(int id);

	public DreamHomeVO editProject(int id);

}
