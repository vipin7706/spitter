package com.john.springinaction.mvc;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.john.springinaction.service.SpitterService;

@Controller
public class HomeController {
	
	private static final int DEFAULT_SPITTLES_PER_PAGE = 25;
	
	@Resource(name = "spitterService")
	private SpitterService spitterService;
	
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model) {
		
		model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
		return "home";
	}

}
