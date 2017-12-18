package com.dreamhome.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dreamhome.service.DreamHomeService;
import com.dreamhome.vo.DreamHomeVO;

@Controller
@RequestMapping("/project")
public class DreamHomeController {

	@Autowired
	private DreamHomeService dreamHomeService;

	@RequestMapping(value="/homepage", method = RequestMethod.GET)
	public ModelAndView getHomePage() {

		ModelAndView model = new ModelAndView("homepage");
		List<DreamHomeVO> projectList = new ArrayList<DreamHomeVO>();
		projectList = dreamHomeService.getProjectList();
		model.addObject("projectList",projectList);
		return model;

	}

	@RequestMapping(value="/deleteproject/{id}", method = RequestMethod.GET)
	public ModelAndView deleteProject(@PathVariable("id") String projectId) {

		//ModelAndView model = new ModelAndView("savesuccess");

		dreamHomeService.deleteProject(Integer.parseInt(projectId));
		//model.addObject("successMessage","Project deleted successfully");
		return new ModelAndView("redirect:/project/homepage");

	}

	@RequestMapping(value="/projectdetails", method = RequestMethod.POST)
	public ModelAndView getProjectDetailsByBuildingName(@RequestParam("projectList") String buildingName) {

		DreamHomeVO dreamHomeVO = new DreamHomeVO();
		ModelAndView model = new ModelAndView("projectdetails");
		dreamHomeVO = dreamHomeService.getProjectDetailsByBuildingName(buildingName);
		model.addObject("dreamHomeVO",dreamHomeVO);
		return model;

	}

	@RequestMapping(value="/addproject", method = RequestMethod.POST)
	public ModelAndView addProject(@ModelAttribute ("dreamHomeCommand") DreamHomeVO dreamHomeVO){
		dreamHomeService.addProject(dreamHomeVO);
		return new ModelAndView("redirect:/project/homepage");

	}
	

	@RequestMapping(value="/addproject", method = RequestMethod.GET)
	public ModelAndView getProjectForm()//@ModelAttribute ("DreamHomeVO") DreamHomeVO dreamHomeVO) {
	{

		ModelAndView model = new ModelAndView("addproject");
		model.addObject("dreamHomeCommand",new DreamHomeVO());
		return model;

	}


	@RequestMapping(value="/editproject/{id}", method = RequestMethod.GET)
	public ModelAndView editProject(@PathVariable("id") String projectId) {
		DreamHomeVO dreamHomeVO = dreamHomeService.editProject(Integer.parseInt(projectId));
		ModelAndView model = new ModelAndView("addproject");
		model.addObject("dreamHomeCommand",dreamHomeVO);
		return  model;

	}

}