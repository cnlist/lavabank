package us.cnlist.lavabank.geo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import us.cnlist.lavabank.entity.geo.City;
import us.cnlist.lavabank.services.GeoService;
import static org.hamcrest.Matchers.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressTest {
    private final String existentNamePart = "енБур";

    @Autowired
    private GeoService geoService;

    @Test
    public void testFindCityByExistentName(){
        List<City> cities = geoService.findCityByName(existentNamePart);
        Assert.assertNotNull(cities);
        Assert.assertThat(cities,is(not(empty())));
    }

}
