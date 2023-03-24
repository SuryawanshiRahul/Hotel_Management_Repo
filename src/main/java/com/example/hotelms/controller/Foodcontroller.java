package com.example.hotelms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelms.entity.FoodEntity;

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
	public List<FoodEntity> getfoder() {
		List<FoodEntity> foodList = new ArrayList<>();
		FoodEntity foodEntity = new FoodEntity();
		foodEntity.setFid(1);
		foodEntity.setFname("pizza");
		foodEntity.setPrice("100");
		foodEntity.setQty(3);
		
		FoodEntity foodEntity2 = new FoodEntity();
		foodEntity2.setFid(2);
		foodEntity2.setFname("samosa");
		foodEntity2.setPrice("15");
		foodEntity2.setQty(5);
		 
		foodList.add(foodEntity);
		foodList.add(foodEntity2);
		return foodList;
	}
	
}
