package com.cognizant.queries;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueryApplication.class, args);
    }

    @Bean
    CommandLineRunner demo(CountryRepository countryRepository) {
        return args -> {
            countryRepository.saveAll(List.of(
                    new Country("IN", "India"),
                    new Country("ID", "Indonesia"),
                    new Country("US", "United States")));

            System.out.println("HQL result:");
            countryRepository.searchByNameUsingHql("ind").forEach(System.out::println);

            System.out.println("Native query result:");
            countryRepository.searchByNameUsingNativeQuery("ind").forEach(System.out::println);
        };
    }
}
