package com.dingdong.dao;

import com.dingdong.pojo.Receiver;

public interface ReceiverMapper {
    int deleteByPrimaryKey(Integer receiverId);

    int insert(Receiver record);

    int insertSelective(Receiver record);

    Receiver selectByPrimaryKey(Integer receiverId);

    int updateByPrimaryKeySelective(Receiver record);

    int updateByPrimaryKey(Receiver record);
}