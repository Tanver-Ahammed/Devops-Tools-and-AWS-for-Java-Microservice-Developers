package com.flight.service.controllers;

import java.util.List;

import com.flight.service.model.Flight;
import com.flight.service.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

	@Autowired
	private FlightRepository repository;

	@GetMapping("/flights")
	public List<Flight> getFlights() {
		return repository.findAll();

	}

}
