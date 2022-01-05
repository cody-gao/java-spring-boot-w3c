package com.cody.dao;

import com.cody.domain.City;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityDao {
    City findById(Long id);

    List<City> findAllCity();

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
