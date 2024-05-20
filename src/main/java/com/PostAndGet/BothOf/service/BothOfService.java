package com.PostAndGet.BothOf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PostAndGet.BothOf.entity.BothOfEntity;
import com.PostAndGet.BothOf.repository.BothOfRepository;

@Service
public class BothOfService implements ServiceImplement {
	@Autowired
	BothOfRepository bothOfRepository;

	@Override
	public BothOfEntity store(BothOfEntity bothOfEntity) {
	
		return bothOfRepository.save(bothOfEntity) ;
	}

	@Override
	public Optional<BothOfEntity>  Get(int id) {
		return bothOfRepository.findById(id);
	}

	@Override
	public List<BothOfEntity> Getlist() {
		return bothOfRepository.findAll();
	}

	

	@Override
	public List<BothOfEntity> post(List<BothOfEntity> bothOfEntities) {
		return bothOfRepository.saveAll(bothOfEntities);
		
	}

	@Override
	public void postall(List<BothOfEntity> bothOfEntities) {
		bothOfRepository.saveAll(bothOfEntities);
		
	}

	@Override
	public BothOfEntity update(BothOfEntity bothOfEntity) {
		Optional<BothOfEntity> bothofentity1 = bothOfRepository.findById(bothOfEntity.getId());
		BothOfEntity bothofentity2 = bothofentity1.get();
		bothofentity2.setId(bothOfEntity.getId());
		bothofentity2.setName(bothOfEntity.getName());
		bothofentity2.setAge(bothOfEntity.getAge());
		return bothOfRepository.save(bothofentity2);
	}

	@Override
	public String  delete(int id) {
		bothOfRepository.deleteById(id);
	    return "deleted";
	}

	
	


}
