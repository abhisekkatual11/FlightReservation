package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {
	
	//http:localhost:9090/startCheckIn
	@RequestMapping("/startCheckIn")
	public String showCheckedIn() {
		return "startCheckedIn";
	}
	
	//http:localhost:9090/startChekedIn
	@RequestMapping("/startChekedIn")
	public String proceedCheckedIn(@RequestParam("id")long id) {
		return "startCheckedIn";
	}
}
