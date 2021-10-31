package com.github.dutorres3108.citiesapi.countries.repository;

import com.github.dutorres3108.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
