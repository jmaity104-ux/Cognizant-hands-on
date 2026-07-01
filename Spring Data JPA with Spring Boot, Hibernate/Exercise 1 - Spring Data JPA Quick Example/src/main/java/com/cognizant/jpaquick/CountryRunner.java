package com.cognizant.jpaquick;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CountryRunner implements CommandLineRunner {

    private final CountryRepository countryRepository;

    public CountryRunner(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void run(String... args) {
        countryRepository.saveAll(List.of(
                new Country("IN", "India"),
                new Country("US", "United States"),
                new Country("JP", "Japan")));

        System.out.println("Countries loaded using Spring Data JPA:");
        countryRepository.findAll().forEach(System.out::println);
    }
}
