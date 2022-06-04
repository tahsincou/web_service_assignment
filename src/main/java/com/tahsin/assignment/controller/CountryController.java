package com.tahsin.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tahsin.assignment.model.Country;
import com.tahsin.assignment.service.CountryService;

@RestController
@RequestMapping("/data")
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@RequestMapping(value="/createCountry", method= RequestMethod.POST)
	public Country createCountry(@RequestBody Country country) {
		return countryService.createCountry(country);
	}

	@RequestMapping(value="/countries", method=RequestMethod.GET)
	public List<Country> getCountries() {
	    return countryService.getCountries();
	}
}
