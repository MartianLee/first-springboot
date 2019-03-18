package com.greenhair.spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greenhair.spring.domain.posts.PostsRepository;
import com.greenhair.spring.dto.posts.PostsSaveRequestDto;
import com.greenhair.spring.service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	
	private PostsRepository postsRepository;
	private PostsService postsService;

	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "HelloWorld2222";
	}
	
	@PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
	
	
}