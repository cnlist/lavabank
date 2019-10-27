package us.cnlist.lavabank.entity.geo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "country")
    private List<Region> regions;
}
