package com.cody.controller;

import com.cody.domain.City;
import com.cody.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityRestController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id){
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public Long modifyCity(@RequestBody City city){
        return cityService.updateCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public Long createCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public List<City> modifyCity(){
        return cityService.findAllCity();
    }
}
