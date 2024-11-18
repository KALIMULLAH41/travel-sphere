package com.TravelSphere.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TravelSphere.Entities.Videos;


public interface VideosRepository extends JpaRepository<Videos,Integer> 
{
	public Videos findByVideoName(String videoName);
}
