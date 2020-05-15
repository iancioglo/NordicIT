package com.inordic.homeWorkParking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inordic.homeWorkParking.dto.Dto;
import com.inordic.homeWorkParking.parking.Parking;

@RestController
@RequestMapping("/parking")
public class ParkingController {
	Parking myParking = new Parking();
	
	@GetMapping("/free")
	public List<Integer> free() {
		return myParking.freePlacesList();
	}
	
	@PostMapping("/park")
	public String park(@RequestBody Dto dto) {
		return myParking.occupate(dto.getNumber());
	}
	
	@PostMapping("/unpark")
	public String unpark(@RequestBody Dto dto) {
		return myParking.free(dto.getNumber());
	}
}
