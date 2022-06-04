package com.tahsin.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tahsin.assignment.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
