package com.PostAndGet.BothOf.controller;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PostAndGet.BothOf.entity.BothOfEntity;
import com.PostAndGet.BothOf.service.ServiceImplement;



@RestController
@RequestMapping("/post")
public class BothOfController {
	@Autowired
	ServiceImplement implement;
	
	@PostMapping("/store")
	public BothOfEntity store(@RequestBody BothOfEntity bothOfEntity) {
		 return implement.store(bothOfEntity);
		
	}
	@PostMapping("/post/all")
	public List<BothOfEntity> postall(@RequestBody  List<BothOfEntity> bothOfEntities){
		return implement.post(bothOfEntities);
		
	}
	@GetMapping("/Get/BothOf/{id}")
	public Optional<BothOfEntity> Get(@PathVariable ("id") int id) {
		return implement.Get(id);
	}
		
	@GetMapping("/get/list")
	public List<BothOfEntity> Getlist(){
		return implement.Getlist();
	}
	
	@PutMapping("/put")
	public BothOfEntity update(@RequestBody BothOfEntity bothOfEntity) {
		return implement.update(bothOfEntity);
		
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return implement.delete(id);
		
	}


}
