package com.dreamhome.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dreamhome.model.DreamHome;
import com.dreamhome.vo.DreamHomeVO;
import com.util.dreamhome.ConversionUtility;

@Component
public class DreamHomeDaoImpl implements DreamHomeDao {

	@Autowired
	private SessionFactory sessionFactory;


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<DreamHomeVO> getProjectList() {
		List<DreamHomeVO> projectList = new ArrayList<DreamHomeVO>();
		Session session = sessionFactory.openSession();
		System.out.println("session created");
		session.beginTransaction();
		Query query =  session.createQuery("select d from DreamHome d");
		//d1 = (DreamHome) session.get(DreamHome.class, 1);

		projectList = query.list();
		System.out.println(projectList);
		return projectList;
	}

	@Override
	public DreamHomeVO getProjectDetailsByBuildingName(String buildingName) {
		DreamHomeVO dreamHomeVO = new DreamHomeVO();
		DreamHome d1 = new DreamHome();
		Session session = sessionFactory.openSession();
		System.out.println("session created");
		session.beginTransaction();
		//Query query =  session.createQuery("from DreamHome d where d.buildingName  ='" +buildingName+"'");
		Query query =  session.createQuery("from DreamHome d where d.buildingName=:buildingName");
		query.setParameter("buildingName", buildingName);
		//d1 = (DreamHome) session.get(DreamHome.class, 1);
		d1 = (DreamHome) query.list().get(0);
		dreamHomeVO = ConversionUtility.modelToVOConversion(d1);
		System.out.println(d1);
		return dreamHomeVO;
	}

	
	public void addProject(DreamHomeVO dreamHomeVO) {

		DreamHome dreamHome = new DreamHome();
		dreamHome = ConversionUtility.voToModelConversion(dreamHomeVO);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		System.out.println("session created");
		if(dreamHome.getId()==0)
		{
			session.save(dreamHome);
		}
		else{
			session.merge(dreamHome);
		}
		
		
		session.getTransaction().commit();
	}

	@Override
	public void deleteProject(int id) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("session created");
		Query query =  session.createQuery("delete from DreamHome d where d.id=:id");
		query.setParameter("id", id);
		query.executeUpdate();
		session.getTransaction().commit();
		
	}

	@Override
	public DreamHomeVO editProject(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("session created");
		DreamHome dreamHome = (DreamHome) session.get(DreamHome.class, id);
		DreamHomeVO dreamHomeVO = ConversionUtility.modelToVOConversion(dreamHome);
		return dreamHomeVO;
	}



}