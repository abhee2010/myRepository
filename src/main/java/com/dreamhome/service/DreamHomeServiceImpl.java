package com.dreamhome.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamhome.dao.DreamHomeDao;
import com.dreamhome.vo.DreamHomeVO;

@Service
public class DreamHomeServiceImpl implements DreamHomeService {

	@Autowired
	private DreamHomeDao dreamHomeDao;

	/**
	 * get Project details by building name
	 * 
	 * @author shailujain
	 * @see com.dreamhome.service.DreamHomeService#getProjectDetailsByBuildingName(java.lang.String)
	 */
	@Override
	public DreamHomeVO getProjectDetailsByBuildingName(String buildingName) {
		return dreamHomeDao.getProjectDetailsByBuildingName(buildingName);
	}

	/**
	 * gives the list of Projects in home page
	 * 
	 * @see com.dreamhome.service.DreamHomeService#getProjectList()
	 */
	@Override
	public List<DreamHomeVO> getProjectList() {
		List<DreamHomeVO> projectList = new ArrayList<DreamHomeVO>();
		projectList = dreamHomeDao.getProjectList();
		return projectList;
	}

	@Override
	public void addProject(DreamHomeVO dreamHomeVO) {
		
		dreamHomeDao.addProject(dreamHomeVO);

	}

	@Override
	public void deleteProject(int id) {
		dreamHomeDao.deleteProject(id);
		
	}

	@Override
	public DreamHomeVO editProject(int id) {
		 return dreamHomeDao.editProject(id);
	}

}
