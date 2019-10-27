package us.cnlist.lavabank.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import us.cnlist.lavabank.entity.secuity.SystemUser;
import us.cnlist.lavabank.repository.security.UserRepository;

@Slf4j
@Service
public class DbUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    //TODO: Log it
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        SystemUser user = userRepository.findByLogin(login);
        log.debug("login:"+login);
        if (user == null) {
            throw new UsernameNotFoundException(login);
        }
        return user;
    }
}
