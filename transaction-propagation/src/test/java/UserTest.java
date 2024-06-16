import com.henry.config.Config;
import com.henry.model.User;
import com.henry.repository.UserRepo;
import com.henry.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringJUnitConfig(Config.class)
public class UserTest {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Autowired
    public UserService userService;

    @Test
    public void Test() {
        userService.updateNickname();
    }

    @Test
    public void Test2() {
        userService.update();
    }
}
