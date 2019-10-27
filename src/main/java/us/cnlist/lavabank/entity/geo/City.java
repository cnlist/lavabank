package us.cnlist.lavabank.entity.geo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "city")
public class City implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "region_id")
    @ManyToOne
    private Region region;
    @Column(name = "name")
    private String name;
}
