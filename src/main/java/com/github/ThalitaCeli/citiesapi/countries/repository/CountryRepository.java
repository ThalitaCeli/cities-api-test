package com.github.ThalitaCeli.citiesapi.countries.repository;

import com.github.ThalitaCeli.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
