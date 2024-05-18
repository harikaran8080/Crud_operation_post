package com.PostAndGet.BothOf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PostAndGet.BothOf.entity.PostEntity;
import com.PostAndGet.BothOf.repository.PostRepository;

@Service
public class PostService implements PostServiceImplement{
	@Autowired
	PostRepository postRepository;
	
	public PostEntity serve() {
		return null;
		
	}

	@Override
	public PostEntity serveImplement(PostEntity postEntity) {
		postRepository.save(postEntity);
		return postEntity;
	}

	
	

}
