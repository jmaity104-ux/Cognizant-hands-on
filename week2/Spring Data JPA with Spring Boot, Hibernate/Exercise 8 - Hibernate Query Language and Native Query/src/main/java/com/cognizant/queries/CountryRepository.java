package com.cognizant.queries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("select c from Country c where lower(c.name) like lower(concat('%', :name, '%'))")
    List<Country> searchByNameUsingHql(@Param("name") String name);

    @Query(value = "select * from country where lower(name) like lower(concat('%', :name, '%'))", nativeQuery = true)
    List<Country> searchByNameUsingNativeQuery(@Param("name") String name);
}
