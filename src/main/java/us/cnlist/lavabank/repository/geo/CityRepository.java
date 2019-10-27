package us.cnlist.lavabank.repository.geo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import us.cnlist.lavabank.entity.geo.City;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    @Query("select city from City city where upper(city.name) like :namePattern")
    List<City> findCityByName(String namePattern);

}
