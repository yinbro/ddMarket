package com.dingdong.dao;

import com.dingdong.pojo.Favorite;

public interface FavoriteMapper {
	public boolean addFavorite(Favorite favorite);
	
	public boolean deleteFavoriteByID(String id);

	public boolean update(Favorite favorite);
}