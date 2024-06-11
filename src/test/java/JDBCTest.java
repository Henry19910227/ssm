import com.henry.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JDBCTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void TestJDBC() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM ssm.users");
        System.out.println(list.size());
    }

    @Test
    public void TestGetUsers() {
        List<User> users = jdbcTemplate.query("SELECT * FROM ssm.users", new BeanPropertyRowMapper<>(User.class));
        System.out.println(users);
    }
}
