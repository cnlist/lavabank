package us.cnlist.lavabank.entity.secuity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@Entity
@Table(name = "system_user")
public class SystemUser implements Serializable, UserDetails {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_user", sequenceName = "seq_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_user")
    private Long id;

    @Column(name = "user_login")
    private String login;
    @Lob
    @Column(name = "user_passwd")
    private String password;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "lock_reason")
    private String lockReason;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return enabled;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }


}
