package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestaurantController {
@GetMapping("newrestaurant")
public String newRestaurant(){
	return "NewRestaurant";
}
}
