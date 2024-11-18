package com.TravelSphere.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.TravelSphere.Entities.Followers;


public interface FollowersRepository extends JpaRepository<Followers, Integer>
{
	public Followers findByEmail(String email);
}
