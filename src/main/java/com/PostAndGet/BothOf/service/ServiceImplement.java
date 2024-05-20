package com.PostAndGet.BothOf.service;

import java.util.List;
import java.util.Optional;

import com.PostAndGet.BothOf.entity.BothOfEntity;

public interface ServiceImplement   {
	public default void main() {
		
	}

	
	public BothOfEntity store(BothOfEntity bothOfEntity);


	public Optional<BothOfEntity> Get(int id);


	public List<BothOfEntity> Getlist();


	public List<BothOfEntity> post(List<BothOfEntity> bothOfEntities);


	void postall(List<BothOfEntity> bothOfEntities);


	public BothOfEntity update(BothOfEntity bothOfEntity);


	public String delete(int id);


	
	
	


    


	
	
	
}
