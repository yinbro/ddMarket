package com.dingdong.dao;

import com.dingdong.pojo.Classify;

public interface ClassifyMapper {
	
    boolean deleteByClassifyID(Integer classifyId);

    boolean insert(Classify record);

    Classify findByClassifyID(Integer classifyId);

    boolean update(Classify record);
}