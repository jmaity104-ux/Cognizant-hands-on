package com.cognizant.ormapping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrMappingApplication.class, args);
    }

    @Bean
    CommandLineRunner demo(CountryRepository countryRepository) {
        return args -> {
            Capital capital = new Capital("New Delhi");
            Country country = new Country("IN", "India", capital);
            countryRepository.save(country);

            countryRepository.findAll()
                    .forEach(savedCountry -> System.out.println(savedCountry.getName()
                            + " - capital: " + savedCountry.getCapital().getName()));
        };
    }
}
