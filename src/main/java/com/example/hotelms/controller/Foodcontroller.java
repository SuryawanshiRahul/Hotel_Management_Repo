package com.example.hotelms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotelapi")
public class Foodcontroller {
	@GetMapping("/getAll")
	public String getAll() {
		return "All Ditels";
	}
	@GetMapping("/fid")
	public String getFoodNo() {
		return "this is food id";
	}
	@GetMapping("/getfoododer")
	public String getfoder() {
		return "this is the  Oder ";
	}
	
}
