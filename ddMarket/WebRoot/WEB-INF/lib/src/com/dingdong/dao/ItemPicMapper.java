package com.dingdong.dao;

import com.dingdong.pojo.ItemPic;

public interface ItemPicMapper {
    int deleteByPrimaryKey(Integer itemPicId);

    int insert(ItemPic record);

    int insertSelective(ItemPic record);

    ItemPic selectByPrimaryKey(Integer itemPicId);

    int updateByPrimaryKeySelective(ItemPic record);

    int updateByPrimaryKey(ItemPic record);
}