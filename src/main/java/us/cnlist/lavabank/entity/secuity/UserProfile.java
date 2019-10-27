package us.cnlist.lavabank.entity.secuity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "user_profile")
public class UserProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String firstName;
    private String secondName;
    private String middleName;
    private Date birthDate;
    private SystemUser systemUser;
    private String email;
    private String phone1;
    private String phone2;
    private String phone3;
}
