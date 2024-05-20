package com.PostAndGet.BothOf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PostAndGet.BothOf.entity.BothOfEntity;
import com.PostAndGet.BothOf.service.BothOfService;

@Repository
public interface BothOfRepository extends JpaRepository<BothOfEntity, Integer>{



	

}
