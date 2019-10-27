package us.cnlist.lavabank.entity.geo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "region")
public class Region {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "country_id")
    @ManyToOne
    private Country country;
    @OneToMany(mappedBy = "region")
    private List<City> cities;
}
