package com.TravelSphere.Services;
import java.util.List;

import com.TravelSphere.Entities.Videos;


public interface VideosService 
{
	public String addVideo(Videos vid);
	public boolean videoExists(String videoName);
	public boolean deleteVideo(int id);
	public List<Videos> getAllVideos();
}
