package com.cody.service.impl;

import com.cody.dao.CityDao;
import com.cody.domain.City;
import com.cody.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }


}
