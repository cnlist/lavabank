package us.cnlist.lavabank.repository.security;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import us.cnlist.lavabank.entity.secuity.SystemUser;

@Repository
public interface UserRepository extends CrudRepository<SystemUser, Long> {
    @Query("SELECT user FROM SystemUser user WHERE user.login =:login and user.enabled=true ")
    SystemUser findByLogin(String login);

}
