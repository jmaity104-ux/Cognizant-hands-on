package com.cognizant.countryservice;

import java.util.List;

public interface CountryService {

    List<Country> getAllCountries();

    Country saveCountry(Country country);
}
