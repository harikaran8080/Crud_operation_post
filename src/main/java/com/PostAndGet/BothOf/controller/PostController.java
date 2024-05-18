package com.PostAndGet.BothOf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PostAndGet.BothOf.entity.PostEntity;
import com.PostAndGet.BothOf.service.PostService;

@RestController
@RequestMapping("/api/cont")
public class PostController {
	@Autowired
	PostService postService;
	
	@PostMapping("/post")
	public PostEntity post(@RequestBody PostEntity postEntity) {
		
		return postService.serveImplement(postEntity);
				
				
		
		
	}


}
