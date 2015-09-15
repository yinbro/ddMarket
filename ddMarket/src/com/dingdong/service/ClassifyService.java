package com.dingdong.service;

import org.apache.ibatis.session.SqlSession;

import com.dingdong.dao.ClassifyMapper;
import com.dingdong.daoImp.ClassifyMapperlmp;
import com.dingdong.pojo.Classify;

public class ClassifyService {

	public boolean addClassfy(Classify classsify){
		boolean isAdded = false;
		ClassifyMapper cm = new ClassifyMapperlmp();
		isAdded = cm.addClassify(classsify);
		return isAdded;
		
	}

	public Classify findClassifyByID(String idStr){
		Classify classsify = null;
		ClassifyMapper cm = new ClassifyMapperlmp();
		int id = Integer.parseInt(idStr);
		classsify = cm.findClassifyByID(id);
		return classsify;
	}
	
	public static void main(String[] args) {
		ClassifyService sc = new ClassifyService();
		Classify classify = new Classify();
		classify.setName("手机");
		System.out.println("增加分类：" + sc.addClassfy(classify));
		
		
		System.out.println("查找分类：" + sc.findClassifyByID("1"));
	}

}
