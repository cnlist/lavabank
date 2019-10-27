package us.cnlist.lavabank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import us.cnlist.lavabank.entity.secuity.SystemUser;
import us.cnlist.lavabank.repository.security.UserRepository;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LavabankApplicationTests {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;


    @Test
    @Transactional
    @Rollback(value = false)
    public void registerUser() {

     assert (true);
    }

}
