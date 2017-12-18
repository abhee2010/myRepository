package com.dreamhome.service;

import java.util.List;

import com.dreamhome.vo.DreamHomeVO;

public interface DreamHomeService {
	/**get building details
	 * @param buildingName
	 * @return
	 */
	public DreamHomeVO getProjectDetailsByBuildingName(String buildingName);

	/** get List Of Projects
	 * @return
	 */
	public List<DreamHomeVO> getProjectList();

	public void addProject(DreamHomeVO dreamHomeVO);

	public void deleteProject(int id);

	public DreamHomeVO editProject(int id);
	
	

}
