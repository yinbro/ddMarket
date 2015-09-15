package com.dingdong.dao;

import com.dingdong.pojo.Classify;

public interface ClassifyMapper {
	
	public boolean addClassify(Classify classsify);
	
	public Classify findClassifyByID(int id);
}