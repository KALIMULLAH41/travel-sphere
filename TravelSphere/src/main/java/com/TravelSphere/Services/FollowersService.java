package com.TravelSphere.Services;
import java.util.List;

import com.TravelSphere.Entities.Followers;


public interface FollowersService 
{
	public String addFollower(Followers fol);
	public boolean emailExists(String email);
	public boolean checkUser(String email,String password);
	public List<Followers> getAllFollowersInfo();
	public boolean deleteFollower(int id);
	public Followers getFollower(String email);
	public void updateFollower(Followers fol);
	public void updateFollowers(Followers fol, String email);
}
