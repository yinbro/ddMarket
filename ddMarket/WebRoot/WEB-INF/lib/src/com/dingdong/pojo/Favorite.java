package com.dingdong.pojo;

import java.util.Date;

public class Favorite {
    private Integer favoriteId;

    private Integer userId;

    private Integer itemId;

    private Date favortime;

    public Integer getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(Integer favoriteId) {
        this.favoriteId = favoriteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Date getFavortime() {
        return favortime;
    }

    public void setFavortime(Date favortime) {
        this.favortime = favortime;
    }
}