package com.springbootdemo.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootDemoEx {
	@GetMapping("/getRestaurant")
	@ResponseBody
	public Restaurant getRestaurant(
			@RequestParam(name = "restaurant", required = false, defaultValue = "Olive Garden") String resName) {
		Restaurant restaurant = getRestaurantFromDatabase();
		System.out.println("Searching for Title...:" + resName);
		if (restaurant.getResName().equals(resName)) {
			return restaurant;
		} else {
			return new Restaurant(resName, "N/A", "N/A", "N/A");
		}
	}

	public Restaurant getRestaurantFromDatabase() {
		Restaurant restaurant = new Restaurant("IHOP", "2890 North Texas BLVD", "Denton", "2345786");
		return restaurant;
	}

	public static void main(String args[]) {
		Restaurant restaurant = new SpringBootDemoEx().getRestaurant("OliveGarden");
		System.out.println(restaurant.getResName() + " : " + restaurant.getResAddress() + restaurant.getResPhn()
				+ restaurant.getResCity());
	}
}
