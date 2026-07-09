package com.cognizant.findcountry;

import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country getCountryByCode(String code) {
        return countryRepository.findById(code.toUpperCase())
                .orElseThrow(() -> new CountryNotFoundException("Country not found for code: " + code));
    }
}
