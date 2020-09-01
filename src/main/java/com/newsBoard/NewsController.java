package com.newsBoard;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

	@RequestMapping("/loadData")
	public String loadData() {
		return "Hogaya hai load";
	}
	
	@RequestMapping("/getNewsByDate")
	public NewsData getNewsByDate(Date date) {
	return null;
	}
	
	@RequestMapping("/getNewsByCity")
	public NewsData getNewsByCity(String city) {
	return null;
	}
}