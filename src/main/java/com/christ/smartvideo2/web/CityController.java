package com.christ.smartvideo2.web;

import com.christ.smartvideo2.repository.CityRepository;
import com.christ.smartvideo2.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    private CityRepository cityRepository;
    @Autowired
    public void setCityRepository(CityRepository cityRepository){
        this.cityRepository=cityRepository;
    }

    //http://localhost:8888/saveCity?cityName=北京&cityIntroduce=中国首都
    @GetMapping(value = "saveCity")
    public String saveCity(String cityName,String cityIntroduce){
        City city = new City(cityName,cityIntroduce);
        cityRepository.save(city);
        return "success";
    }

//    //http://localhost:8888/deleteCity?cityId=2
//    @GetMapping(value = "deleteCity")
//    public String deleteCity(int cityId){
//        cityRepository.delete(cityId);
//        return "success";
//    }

    //http://localhost:8888/updateCity?cityId=3&cityName=沈阳&cityIntroduce=辽宁省省会
    @GetMapping(value = "updateCity")
    public String updateCity(int cityId,String cityName,String cityIntroduce){
        City city = new City(cityId,cityName,cityIntroduce);
        cityRepository.save(city);
        return "success";
    }

    //http://localhost:8888/getCityById?cityId=3
    @GetMapping(value = "getCityById")
    @ResponseBody
    public City getCityById(int cityId){
        City city = cityRepository.findById(cityId).orElse(null);
        return city;
    }
}