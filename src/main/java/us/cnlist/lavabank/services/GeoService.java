package us.cnlist.lavabank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.cnlist.lavabank.entity.geo.City;
import us.cnlist.lavabank.repository.geo.CityRepository;

import java.util.List;

@Service
public class GeoService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findCityByName(String namePattern){
        return cityRepository.findCityByName("%"+namePattern.toUpperCase()+"%");
    }

}
