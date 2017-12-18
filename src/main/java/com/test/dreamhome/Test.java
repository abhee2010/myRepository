package com.test.dreamhome;

import java.util.Date;

import com.dreamhome.dao.DreamHomeDaoImpl;
import com.dreamhome.vo.DreamHomeVO;
import com.util.dreamhome.ConversionUtility;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DreamHomeDaoImpl d = new DreamHomeDaoImpl();
		DreamHomeVO dreamHomeVO = new DreamHomeVO();
		dreamHomeVO = ConversionUtility.setValues("Eden Spaces", 820f, 596f, 456356l, "Mukai Chowk Ravet", new Date(), false, "y");
		d.addProject(dreamHomeVO);
		System.out.println("Object added");

	}

}
