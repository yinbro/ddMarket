package com.dingdong.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer userId;

    private Long totalamount;

    private Integer receiverId;

    private Integer orderstates;

    private String expressinfo;

    private Date ordertime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getOrderstates() {
        return orderstates;
    }

    public void setOrderstates(Integer orderstates) {
        this.orderstates = orderstates;
    }

    public String getExpressinfo() {
        return expressinfo;
    }

    public void setExpressinfo(String expressinfo) {
        this.expressinfo = expressinfo == null ? null : expressinfo.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }
}