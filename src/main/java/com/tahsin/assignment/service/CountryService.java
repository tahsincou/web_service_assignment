package com.tahsin.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tahsin.assignment.model.Country;
import com.tahsin.assignment.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository countryRepository;
	
	public Country createCountry(Country country) {
		return countryRepository.save(country);
	}

	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
}
